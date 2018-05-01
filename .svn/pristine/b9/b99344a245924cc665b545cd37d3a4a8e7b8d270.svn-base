package cn.opt.controller;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.github.pagehelper.PageInfo;

import cn.opt.po.ConnStuTea;
import cn.opt.po.Homework;
import cn.opt.po.Student;
import cn.opt.service.ConnStuTeaService;
import cn.opt.service.HomeWorkService;
import cn.opt.service.PublishService;
import cn.opt.service.StudentService;
import cn.opt.utils.MD5Utils;
import cn.opt.vo.HomeworkVo;
import cn.opt.vo.PageVo;
import cn.opt.vo.PublishVo;

@Controller
@RequestMapping({ "/StudentController" })
public class StudentController {

	@Autowired
	private StudentService studentService;
	@Autowired
	private ConnStuTeaService connStuTeaService;
	@Autowired
	private PublishService publishService;
	@Autowired
	private	HomeWorkService homeWorkService;

	@RequestMapping({ "/getAllStu.action" })
	public String toGetAllStu(Model model, Integer currentPage, Integer pageSize) {
		PageInfo<Student> pageInfo = this.studentService.getAllStu(currentPage, pageSize);
		model.addAttribute("pageInfo", pageInfo);
		return "/manager/adminindex.jsp";
	}

	@RequestMapping({ "/getAllStu1.action" })
	@ResponseBody
	public Map<String, Object> GetAllStu(PageVo pvo) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("total", this.studentService.getCounts());
		map.put("rows", this.studentService.getAllStu1(pvo.getPage(), pvo.getRows()));
		return map;
	}

	@RequestMapping({ "/editStu.action" })
	@ResponseBody
	public Student toeditStu(Integer id) {
		return this.studentService.findStuById(id);
	}

	@RequestMapping("/deleteStu.action")
	@ResponseBody
	public String todeleteStu(Integer id) {
		this.studentService.deleteStuById(id);
		return "/StudentController/getAllStu.action?currentPage=1&pageSize=5";
	}

	@RequestMapping("/updateStu.action")
	public String toUpdateStu(Student stu) {
		studentService.updateStu(stu.getStuId(), stu);
		return "singleCenter";
	}
	
	@RequestMapping("/updatePwd.action")
	public @ResponseBody String updatePwd(String stuId,String oldpwd,String newpwd) throws Exception{
		String flag = "";
		Student student = studentService.findStuById(Integer.parseInt(stuId));
		if(student!=null){
			if(!student.getStuPwd().equals(MD5Utils.md5(oldpwd))){
				flag = "no";
			}else{
				studentService.updatePwd(Integer.parseInt(stuId), newpwd);
				flag = "ok";
			}
		}
		return flag;
	}
	/**
	 * 文件上传
	 * @throws Exception 
	 */
	@RequestMapping("/uploadPic.action")
	public String upload(MultipartFile stuPic,HttpSession session,Model model) throws Exception{
		Student stu = (Student) session.getAttribute("student");
		if(stu == null){
			return "login";
		}
		if(stuPic!=null){
			String filePath = "F:\\OpointResource\\pic\\tou_pic\\";
			String originalFilename = stuPic.getOriginalFilename();
			String fileName = UUID.randomUUID().toString()+originalFilename.substring(originalFilename.lastIndexOf("."));
			File file = new File(filePath+fileName);
			stuPic.transferTo(file);
			stu.setStuPic(fileName);
			studentService.updateStu(stu.getStuId(), stu);
			model.addAttribute("fileName", fileName);
		}
		return "singleCenter";
	}

	/**
	 * 学生提交提问消息
	 * @throws Exception 
	 */
	@RequestMapping("/askTea.action")
	public String askTea(Integer tid,String askInfo,HttpServletRequest request,Model model,HttpSession session) throws Exception{
		Student stu = (Student) session.getAttribute("student");
		if(stu==null){
			return "login";
		}
		//学生提问数加1
		Integer stuQuecount = stu.getStuQuecount();
		if(stuQuecount == null){
			stuQuecount = 1;
		}else{
			stuQuecount += 1;
		}
		stu.setStuQuecount(stuQuecount);
		studentService.updateStu(stu.getStuId(), stu);
		
		String fName = request.getParameter("file_name");
		ConnStuTea connStuTea = new ConnStuTea();
		if(fName.length()>0){
			if(request instanceof MultipartHttpServletRequest){
				MultipartHttpServletRequest multipartHttpServletRequest = (MultipartHttpServletRequest) request;
				Map<String, MultipartFile> map = multipartHttpServletRequest.getFileMap();
				for(Map.Entry<String, MultipartFile> entry:map.entrySet()){
					String originalFilename = entry.getValue().getOriginalFilename();
					String random = UUID.randomUUID().toString().substring(0,4);
					String fileName = random+originalFilename.substring(originalFilename.lastIndexOf("."));
					File file = new File("F:\\OpointResource\\pic\\ask_pic\\"+tid+"\\");
					if( !file.isDirectory()){
						file.mkdir();
					}
					String filePath = file.getAbsolutePath();
					File file1 = new File(filePath+"\\"+fileName);
					entry.getValue().transferTo(file1);
					connStuTea.setAskPic(fileName);
				}
			}
			connStuTea.setStuId(stu.getStuId());
			connStuTea.setTeaId(tid);
			connStuTea.setAskInfo(askInfo);
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分");
			String format = dateFormat.format(new Date());
			connStuTea.setAskTime(format);
			connStuTea.setAskState(0);
			connStuTeaService.addAskMessageByStuTea(connStuTea);
		}else{
			connStuTea.setStuId(stu.getStuId());
			connStuTea.setTeaId(tid);
			connStuTea.setAskInfo(askInfo);
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分");
			String format = dateFormat.format(new Date());
			connStuTea.setAskTime(format);
			connStuTea.setAskState(0);
			connStuTeaService.addAskMessageByStuTea(connStuTea);
		}
		return "forward:/TeacherController/getAllTeacher.action";
	}
	
	/**
	 * 删除当前提问
	 */
	@RequestMapping("/delAskByaskid.action")
	@ResponseBody
	public void delAskByaid(Integer askid){
		connStuTeaService.delAskMessageByaskId(askid);
	}
	
	@RequestMapping("/getHomeWorks.action")
	public String getHomeWorks(HttpSession session,Model model){
		Student student = (Student) session.getAttribute("student");
		if(student ==null){
			return "login";
		}
		//查看最新作业
		List<PublishVo> pubVolist = publishService.getHomeWorkList(student.getStuId());
		//收到老师的批改回复
		List<HomeworkVo> workVoList = homeWorkService.getAllHomeWorksByStuid(student.getStuId());
		
		model.addAttribute("workVoList", workVoList);
		model.addAttribute("pubList", pubVolist);
		return "homework";
		
	}
	/**
	 * 查看详细批改信息
	 */
	@RequestMapping("/historyHomework.action")
	public String historyHomework(HttpSession session,Model model,String replyworkId){
		HomeworkVo homeworkVo = homeWorkService.getHomeWorksByReplyWorkId(replyworkId);
		model.addAttribute("homeworkVo", homeworkVo);
		return "historyHomework";
	}
	/**
	 * 去做作业页面
	 */
	@RequestMapping("/dohomework.action")
	public String dohomework(Integer teaId,String pubId,Integer claid,String pubInfo,String pubpic,String pubTime,Model model){
		model.addAttribute("pubInfo", pubInfo);
		model.addAttribute("pubTime", pubTime);
		model.addAttribute("pubpic", pubpic);
		model.addAttribute("claid", claid);
		model.addAttribute("pubId", pubId);
		model.addAttribute("teaId", teaId);
		return "dohomework";
	}
	/**
	 * 回复老师发布的作业
	 */
	@RequestMapping("/replywork.action")
	public String replywork(Integer stuid,String pubId,Integer teaid,Integer claid,String replyInfo,HttpServletRequest request) throws Exception{
		String fName = request.getParameter("file_name");
		String homeworkid = UUID.randomUUID().toString().substring(0,4);
		if(fName.length()>0){
			String fileName ="";
			if(request instanceof MultipartHttpServletRequest){
				MultipartHttpServletRequest multipartHttpServletRequest = (MultipartHttpServletRequest) request;
				Map<String, MultipartFile> map = multipartHttpServletRequest.getFileMap();
				for(Map.Entry<String, MultipartFile> entry:map.entrySet()){
					String originalFilename = entry.getValue().getOriginalFilename();
					String random = UUID.randomUUID().toString().substring(0,4);
					fileName = random+originalFilename.substring(originalFilename.lastIndexOf("."));
					File file = new File("F:\\OpointResource\\pic\\work_pic\\"+claid+"\\");
					if( !file.isDirectory()){
						file.mkdir();
					}
					String filePath = file.getAbsolutePath();
					File file1 = new File(filePath+"\\"+fileName);
					entry.getValue().transferTo(file1);
				}
			}
			Homework homework = new Homework();
			homework.setReplyworkId(homeworkid);
			homework.setReplyworkInfo(replyInfo);
			homework.setReplyworkClaid(claid);
			homework.setReplyworkTeaid(teaid);
			homework.setReplyworkStuid(stuid);
			homework.setPublishId(pubId);
			homework.setReplyworkPic(fileName);
			homework.setSolveworkState(0);
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分");
			String format = dateFormat.format(new Date());
			homework.setReplyworkTime(format);
//			homework.setSolveworkState(0);
			homeWorkService.submitClaWork(homework);
		}else{
			Homework homework = new Homework();
			homework.setReplyworkId(homeworkid);
			homework.setReplyworkInfo(replyInfo);
			homework.setReplyworkClaid(claid);
			homework.setReplyworkTeaid(teaid);
			homework.setReplyworkStuid(stuid);
			homework.setPublishId(pubId);
//			homework.setSolveworkState(0);
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分");
			String format = dateFormat.format(new Date());
			homework.setReplyworkTime(format);
			homework.setSolveworkState(0);
			homeWorkService.submitClaWork(homework);
		}
		return "redirect:/StudentController/getHomeWorks.action";
	}
}


