package cn.opt.controller;

import java.lang.management.GarbageCollectorMXBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.opt.po.Exam;
import cn.opt.po.Paper;
import cn.opt.po.Student;
import cn.opt.service.ExamService;
import cn.opt.service.PaperService;
import cn.opt.vo.ExamVo;
import cn.opt.vo.GradeListVo;

@Controller
@RequestMapping({ "/ExamController" })
public class ExamController {

	@Autowired
	public ExamService examService;
	
	@Autowired
	public PaperService paperService;
	
	@RequestMapping("/exam_index.action")
	public String exam_index(Model model){
		List<Paper> paList_s = paperService.getPapers(1);
		List<Paper> paList_x = paperService.getPapers(2);
		model.addAttribute("paList_s", paList_s);
		model.addAttribute("paList_x", paList_x);
		return "exam_index";
	}
	@RequestMapping("/exam_index2.action")
	public String exam_index2(Model model){
		List<Paper> allPaperList = paperService.getAllPaper();
		model.addAttribute("allPaperList", allPaperList);
		return "exam_index2";
	}
	/**
	 * 查看我的答案
	 */
	@RequestMapping("/showMyparse.action")
	public String  showparse(String exid,Integer pid,Model model){
		Exam exam = examService.getExamByExid(exid);
		List<String> datiImg = null;
		if(exam.getExDatiAns()!=null){
			datiImg = new ArrayList<String>();
			String[] datis = exam.getExDatiAns().split("-");
			for(int i=0;i<datis.length;i++){
				datiImg.add(datis[i]);
			}
		}
		List<String> xuanze = new ArrayList<String>();
		String[] opts = examService.getExamByExid(exid).getExOptAns().split("-");
		
		for(int i=0;i<opts.length;i++){
			xuanze.add(opts[i]);
		}
		
		Paper paper = paperService.getPaperById(pid);
		model.addAttribute("paper", paper);
		model.addAttribute("datiImg", datiImg);
		model.addAttribute("xuanze", xuanze);
		return "exam_userwrite";
	}
	@RequestMapping("/showGradeList.action")
	public String showGradeList(HttpSession session,Model model){
		Student stu = (Student) session.getAttribute("student");
		if(stu!=null){
			//总次数
			Integer examCounts = examService.examCountsBysid(stu.getStuId());
			Map<ExamVo,Integer> map = new HashMap<ExamVo,Integer>();
			
			List<Exam> examList = examService.getExamListBysid(stu.getStuId());
			Set<Integer> pidSet = new HashSet<Integer>();
			for(Exam ex:examList){
				pidSet.add(ex.getPaId());
			}
			//所有pid都不相同。。
			for(Integer pid:pidSet){
				Integer paCounts = examService.paperCountsBysidAndpid(stu.getStuId(),pid);
				List<Exam> list = examService.getExamListBysidAndpid(stu.getStuId(),pid);
				String paName="";
				ExamVo examVo = new ExamVo();
				for(Exam ex:list){
					examVo.setExam(ex);
					paName = paperService.getPaperById(ex.getPaId()).getPaName();
					examVo.setPa_name(paName);
				}
				map.put(examVo, paCounts);
			}
			model.addAttribute("map", map);
			model.addAttribute("examCounts", examCounts);
			return "reportCard";
		}else{
			return "login";
		}
	}
	
	
	@RequestMapping("/getGradeList.action")
	@ResponseBody
	public List<GradeListVo> getGradeList(HttpSession session,Integer pid){
		List<GradeListVo> gradeListVos = new ArrayList<GradeListVo>();
		Student stu = (Student) session.getAttribute("student");
		if(stu!=null){
			List<Exam> examList = examService.getExamListBysidAndpid(stu.getStuId(), pid);
			if(examList.size()>3){
				//按照时间排序  取出最后三次
			}else{
				//按照时间排序即可
				for(Exam ex:examList){
					GradeListVo gradeListVo = new GradeListVo();
					String grade = ex.getExGrade();
					if(grade !=null){
						String number[]= grade.split("\\p{Punct}");
						gradeListVo.setkGrade(Integer.parseInt(number[0]));
						gradeListVo.setzGrade(Integer.parseInt(number[1]));
						gradeListVo.setfGrade(Integer.parseInt(number[2]));
						gradeListVo.setPaName(paperService.getPaperById(pid).getPaName());
						gradeListVos.add(gradeListVo);
					}else{
						gradeListVo.setPaName(paperService.getPaperById(pid).getPaName());
						gradeListVos.add(gradeListVo);
					}
				}
			}
		}
		return gradeListVos;
	}
}