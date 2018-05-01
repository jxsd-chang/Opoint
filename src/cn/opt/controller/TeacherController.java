package cn.opt.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

import cn.opt.exception.MessageException;
import cn.opt.po.Clagrade;
import cn.opt.po.ConnStuTea;
import cn.opt.po.Etimu;
import cn.opt.po.Exam;
import cn.opt.po.Homework;
import cn.opt.po.Publish;
import cn.opt.po.Student;
import cn.opt.po.Teacher;
import cn.opt.service.ClagradeService;
import cn.opt.service.ConnStuTeaService;
import cn.opt.service.CourseService;
import cn.opt.service.EtimuService;
import cn.opt.service.ExamService;
import cn.opt.service.HomeWorkService;
import cn.opt.service.PaperService;
import cn.opt.service.PublishService;
import cn.opt.service.StudentService;
import cn.opt.service.TeacherService;
import cn.opt.utils.MD5Utils;
import cn.opt.vo.AskQueVo;
import cn.opt.vo.EtimuVo;
import cn.opt.vo.ExamVo;
import cn.opt.vo.HomeworkVo;
import cn.opt.vo.PageVo;
import cn.opt.vo.TeacherAttenVo;

@Controller
@RequestMapping({ "/TeacherController" })
public class TeacherController {

	@Autowired
	private TeacherService teacherService;
	@Autowired
	private StudentService studentService;
	@Autowired
	private ExamService examService;
	@Autowired
	private PaperService paperService;
	@Autowired
	private CourseService courseService;
	@Autowired
	private EtimuService etimuService;
	@Autowired
	private ConnStuTeaService connStuTeaService;
	@Autowired
	private PublishService publishService;
	@Autowired
	private HomeWorkService homeWorkService;
	@Autowired
	private ClagradeService clagradeService;

	@RequestMapping({ "/getAllTea.action" })
	@ResponseBody
	public Map<String,Object> getAllTea(PageVo vo) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("total", teacherService.getCounts());
		map.put("rows", teacherService.getAllTea(vo.getPage(), vo.getRows()));
		return map;
	}
	
	@RequestMapping({ "/getAllTeacher.action" })
	public String getAllTeacher(Model model,HttpSession session) {
		Student stu = (Student) session.getAttribute("student");
		List<TeacherAttenVo> attenVos = new ArrayList<TeacherAttenVo>();
		List<Teacher> teaList = teacherService.getAllTeacher();
		List<Teacher> attenTeaList = new ArrayList<Teacher>();
		if(stu != null){
			List<ConnStuTea> attenList = connStuTeaService.getAttenBySid(stu.getStuId(),1);
			if(attenList !=null && attenList.size()>0){
				for(ConnStuTea connStuTea:attenList){
					TeacherAttenVo attenVo = new TeacherAttenVo();
					Teacher teacher = teacherService.findTeaById(connStuTea.getTeaId());
					attenTeaList.add(teacher);
					attenVo.setFlag(1);
					attenVo.setTeacher(teacher);
					attenVos.add(attenVo);
				}
				teaList.removeAll(attenTeaList);
				for(Teacher tea:teaList){
					TeacherAttenVo attenVo = new TeacherAttenVo();
					attenVo.setFlag(0);
					attenVo.setTeacher(tea);
					attenVos.add(attenVo);
				}
			}else{
				for(Teacher tea:teaList){
					TeacherAttenVo attenVo = new TeacherAttenVo();
					attenVo.setFlag(0);
					attenVo.setTeacher(tea);
					attenVos.add(attenVo);
				}
			}
			model.addAttribute("attenVos",attenVos);
		}
		return "ask_teacher";
	}
	
	@RequestMapping("/sortTeaList.action")
	public String sortTeaList(String opt,Model model,HttpSession session){
		Student stu = (Student) session.getAttribute("student");
		List<TeacherAttenVo> attenVos = new ArrayList<TeacherAttenVo>();
		List<Teacher> teaList = teacherService.sortTeaByParm(opt);
		List<Teacher> attenList = new ArrayList<Teacher>();
		if(stu != null){
			List<ConnStuTea> attstuList = connStuTeaService.getAttenBySid(stu.getStuId(),1);
			if(attstuList !=null && attstuList.size()>0){
				for(ConnStuTea connStuTea:attstuList){
					Teacher teacher = teacherService.findTeaById(connStuTea.getTeaId());
					attenList.add(teacher);
					TeacherAttenVo attenVo = new TeacherAttenVo();
					attenVo.setFlag(1);
					attenVo.setTeacher(teacher);
					attenVos.add(attenVo);
				}
				teaList.removeAll(attenList);
				for(Teacher tea:teaList){
					TeacherAttenVo attenVo = new TeacherAttenVo();
					attenVo.setFlag(0);
					attenVo.setTeacher(tea);
					attenVos.add(attenVo);
				}
				//对List<TeacherAttenVo> attenVos = new ArrayList<TeacherAttenVo>();进行排序
				if(opt.equals("2")){
					Collections.sort(attenVos, new Comparator<TeacherAttenVo>(){
			            public int compare(TeacherAttenVo p1, TeacherAttenVo p2) {
			            	Integer atten_p1 = p1.getTeacher().getTeaAtten();
			            	Integer atten_p2 = p2.getTeacher().getTeaAtten();
			            	if(atten_p1==null){
			            		atten_p1 = 0;
			            	}
			            	if(atten_p2 == null){
			            		atten_p2 = 0;
			            	}
			            	if(atten_p1 != null && atten_p2!=null){
			            		if(atten_p1 < atten_p2){
			            			return 1;
			            		}
			            		if(atten_p1 == atten_p2){
			            			return 0;
			            		}
			            	}
			                return -1;
			            }
			        });
				}else{
					Collections.sort(attenVos, new Comparator<TeacherAttenVo>(){
			            public int compare(TeacherAttenVo p1, TeacherAttenVo p2) {
			            	Integer qucount_p1 = p1.getTeacher().getTeaQucount();
			            	Integer qucount_p2 = p2.getTeacher().getTeaQucount();
			            	if(qucount_p1 == null ){
			            		qucount_p1 = 0;
			            	}
			            	if(qucount_p2 == null){
			            		qucount_p2 = 0;
			            	}
			            	if(qucount_p1!=null && qucount_p2!=null){
			            		if(qucount_p1 < qucount_p2){
			            			return 1;
			            		}
			            		if(qucount_p1 == qucount_p2){
			            			return 0;
			            		}
			            	}
			            	return -1;
			            }
			        });
				}
			}else{
				System.out.println(teaList.size()+"xixi");
				for(Teacher tea:teaList){
					TeacherAttenVo attenVo = new TeacherAttenVo();
					attenVo.setFlag(0);
					attenVo.setTeacher(tea);
					attenVos.add(attenVo);
				}
			}
		}
		model.addAttribute("attenVos",attenVos);
		return "ask_teacher";
	}

	@RequestMapping({ "/deleteTea.action" })
	@ResponseBody
	public String toDeleTea(Integer id) {
		this.teacherService.deleteTeaById(id.intValue());
		return "/manager/adminteacher.jsp";
	}

	@RequestMapping({ "/editTea.action" })
	@ResponseBody
	public Teacher toeditStu(Integer id) {
		return this.teacherService.findTeaById(id);
	}

	@RequestMapping({ "/updateTea.action" })
	public String updateTea(Teacher teacher) {
		this.teacherService.updateTea(teacher);
		return "singleCenterTea";
	}

	@RequestMapping("/updatePwd.action")
	public @ResponseBody String updatePwd(String teaId,String oldpwd,String newpwd) throws Exception{
		String flag = "";
		Teacher teacher = teacherService.findTeaById(Integer.parseInt(teaId));
		System.out.println("NIMA");
		if(teacher!=null){
			if(!teacher.getTeaPwd().equals(MD5Utils.md5(oldpwd))){
				flag = "no";
			}else{
				teacherService.updatePwd(Integer.parseInt(teaId), newpwd);
				flag = "ok";
			}
		}
		return flag;
	}
	
	@RequestMapping({ "/tojieshaoPage.action" })
	public String troduceTeacher(Integer id, Model model) {
		Teacher teacher = this.teacherService.findTeaById(id);
		model.addAttribute("teacher", teacher);
		return "teacher";
	}
	@RequestMapping("/toTeaFunPage.action")
	public String  toExamPage(HttpSession session) {
		return "selectType_tea";
	}

	
	@RequestMapping("/tojudgePaper.action")
	public String tojudgePaper(Model model,HttpSession session){
		Teacher tea = (Teacher)session.getAttribute("teacher");
		if(tea != null){
			List<ExamVo> examItems = examService.getExamsByTid(tea.getTeaId());
			if(examItems!=null){
				for(ExamVo examVo:examItems){
					Student student = studentService.findStuById(examVo.getExam().getStuId());
					examVo.setStudent(student);
					examVo.setCou_name(courseService.getCourseById(examVo.getExam().getCouId()).getCouName());
					examVo.setPa_name(paperService.getPaperById(examVo.getExam().getPaId()).getPaName());
				}
			}
			int examCounts = examService.getexamCounts();
			model.addAttribute("examCounts", examCounts);
			model.addAttribute("examItems", examItems);
		}
		return "judgePaper";
	}
	
	//批改试卷
	@RequestMapping("/judgePaper.action")
	public String judgePaper(Integer sid,String exid,Integer pid,String optAns,String datiAns,Model model){
		List<Etimu> list = etimuService.getAllTiMu(pid);
		List<EtimuVo> etimuVoList = new ArrayList<EtimuVo>();
		List<String> datiParList = new ArrayList<String>();
		for(Etimu eti:list){
			if(eti.getEtimuExp()!=null){
				datiParList.add(eti.getEtimuExp());
			}
		}
		//组装optAns
		String[] opts = optAns.split("-");
		//组装datiAns
		if(datiAns != ""){
			String[] datis = datiAns.split("-");
			for(int i=0;i<list.size();i++){
				EtimuVo etimuVo = new EtimuVo();
				etimuVo.setEtimu(list.get(i));
				if(i<opts.length){
					etimuVo.setOpt_ans(opts[i]);
				}else{
					etimuVo.setDati_ans(datis[i-opts.length]);
				}
				etimuVoList.add(etimuVo);
			}
		}else{
			for(int i=0;i<list.size();i++){
				EtimuVo etimuVo = new EtimuVo();
				etimuVo.setEtimu(list.get(i));
				if(i<opts.length){
					etimuVo.setOpt_ans(opts[i]);
				}
				etimuVoList.add(etimuVo);
			}
		}
		String mulu = "paper"+pid;
		model.addAttribute("exid", exid);
		model.addAttribute("mulu", mulu);
		model.addAttribute("muluparse", mulu+"_parse");
		model.addAttribute("pid", pid);
		model.addAttribute("datiParList", datiParList);
		model.addAttribute("studentExam",studentService.findStuById(sid));
		model.addAttribute("extime", examService.getExamByExid(exid).getExTime());
		model.addAttribute("etimuVoList", etimuVoList);
		return "judgePaper_info";
	}
	/**
	 * 查阅批改
	 */
	@RequestMapping("/viewjudgeResult.action")
	public String viewjudgeResult(Integer sid,String exid,Integer pid,String optAns,String datiAns,Model model){
		List<Etimu> list = etimuService.getAllTiMu(pid);
		List<EtimuVo> etimuVoList = new ArrayList<EtimuVo>();
		List<String> datiParList = new ArrayList<String>();
		for(Etimu eti:list){
			if(eti.getEtimuExp()!=null){
				datiParList.add(eti.getEtimuExp());
			}
		}
		//组装optAns
		String[] opts = optAns.split("-");
		//组装datiAns
		if(datiAns != ""){
			String[] datis = datiAns.split("-");
			for(int i=0;i<list.size();i++){
				EtimuVo etimuVo = new EtimuVo();
				etimuVo.setEtimu(list.get(i));
				if(i<opts.length){
					etimuVo.setOpt_ans(opts[i]);
				}else{
					etimuVo.setDati_ans(datis[i-opts.length]);
				}
				etimuVoList.add(etimuVo);
			}
		}else{
			for(int i=0;i<list.size();i++){
				EtimuVo etimuVo = new EtimuVo();
				etimuVo.setEtimu(list.get(i));
				if(i<opts.length){
					etimuVo.setOpt_ans(opts[i]);
				}
				etimuVoList.add(etimuVo);
			}
		}
		//得到考试结果
		String grade = examService.getExamByExid(exid).getExGrade();
		String number[]= grade.split("\\p{Punct}");
		model.addAttribute("opts", number[0]);
		model.addAttribute("datis", number[1]);
		model.addAttribute("total", number[2]);
		String mulu = "paper"+pid;
		model.addAttribute("exid", exid);
		model.addAttribute("mulu", mulu);
		model.addAttribute("muluparse", mulu+"_parse");
		model.addAttribute("pid", pid);
		model.addAttribute("datiParList", datiParList);
		model.addAttribute("studentExam",studentService.findStuById(sid));
		model.addAttribute("extime", examService.getExamByExid(exid).getExTime());
		model.addAttribute("etimuVoList", etimuVoList);
		return "judgePaper_info";
	}
	
	
	/**
	 * 提交成绩
	 */
	@RequestMapping("/submitGrade.action")
	@ResponseBody
	public String submit(String exid,Integer kGrade,Integer zGrade,Integer fGrade){
		Exam exam = examService.getExamByExid(exid);
		StringBuffer buffer = new StringBuffer();
		buffer.append(kGrade).append("+").append(zGrade).append("=").append(fGrade);
		exam.setExGrade(buffer.toString());
		//更改试卷状态
		exam.setExState(1);
		examService.updateExam(exid, exam);
		return "ok";
	}
	
	/**
	 * 关注
	 */
	@RequestMapping("/attention.action")
	public @ResponseBody String attention(Integer sid,Integer tid){
		List<ConnStuTea> list = connStuTeaService.getAttenBtSidAndTid(sid, tid);
		if(list == null){
			//没有提问就关注。。。。。
			ConnStuTea connStuTea = new ConnStuTea();
			connStuTea.setStuId(sid);
			connStuTea.setTeaId(tid);
			connStuTea.setIsatten(1);
			connStuTeaService.addAskMessageByStuTea(connStuTea);
			Teacher teacher = teacherService.findTeaById(tid);
			Integer atten = teacher.getTeaAtten();
			if(atten==null){
				atten = 10;
			}else{
				atten = atten+10;
			}
			teacher.setTeaAtten(atten);
			teacherService.updateTea(teacher);
		}else{
			for(ConnStuTea connStuTea:list){
				if(connStuTea.getIsatten()==null || connStuTea.getIsatten() == 0){
					connStuTea.setIsatten(1);
					connStuTeaService.updateAskStuTea(connStuTea);
					Teacher tea = teacherService.findTeaById(connStuTea.getTeaId());
					if(tea.getTeaAtten()==null || tea.getTeaAtten() == 0){
						tea.setTeaAtten(10);
					}else{
						tea.setTeaAtten(tea.getTeaAtten()+10);
					}
					teacherService.updateTea(tea);
				}
			}
		}
		return "ok";
	}
	/**
	 * 取消关注
	 */
	@RequestMapping("/qxattention.action")
	@ResponseBody
	public void qxatten(Integer sid,Integer tid){
		connStuTeaService.quAtten(sid,tid);
		Teacher teacher = teacherService.findTeaById(tid);
		Integer teaAtten = teacher.getTeaAtten();
		teaAtten = teaAtten - 10;
		teacher.setTeaAtten(teaAtten);
		teacherService.updateTea(teacher);
	}
	
	@RequestMapping("/solveProblem.action")
	public String solveProblem(HttpSession session,Model model){
		List<AskQueVo> askQueVos = new ArrayList<AskQueVo>();
		Teacher tea = (Teacher) session.getAttribute("teacher");
		List<ConnStuTea> list = teacherService.getAllAskFromStu(tea.getTeaId());
		if(list != null){
			for(ConnStuTea st:list){
				AskQueVo askQueVo = new AskQueVo();
				askQueVo.setConnStuTea(st);
				askQueVo.setStuName(studentService.findStuById(st.getStuId()).getStuName());
				askQueVo.setTeaName(teacherService.findTeaById(st.getTeaId()).getTeaName());
				System.out.println(askQueVo.getStuName()+askQueVo.getTeaName());
				askQueVos.add(askQueVo);
			}
			model.addAttribute("askvoList", askQueVos);
		}else{
			model.addAttribute("msg1", "没人来提问");
		}
		return "questionList";
	}
	
	@RequestMapping("/tijiaoAns.action")
	public @ResponseBody String tijiaoAns(Integer askid,String solveinfo,Model model,HttpSession session){
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分");
		String format = dateFormat.format(new Date());
		connStuTeaService.replyAskMessage(askid, solveinfo, format, 1);
		Teacher tea = (Teacher) session.getAttribute("teacher");
		Integer teaQucount = tea.getTeaQucount();
		if(teaQucount == null){
			tea.setTeaQucount(1);
			teacherService.updateTea(tea);
		}else{
			teaQucount++;
			tea.setTeaQucount(teaQucount);
			teacherService.updateTea(tea);
		}
		return "ok";
	}
	
	/**
	 * 老师头像文件上传
	 * @throws Exception 
	 */
	@RequestMapping("/uploadPic.action")
	public String upload(MultipartFile teaPic,HttpSession session,Model model) throws Exception{
		Teacher tea = (Teacher) session.getAttribute("teacher");
		if(tea == null){
			return "login";
		}
		String originalFilename = teaPic.getOriginalFilename();
		String filePath = "F:\\OpointResource\\pic\\tou_pic\\";
		String fileName =UUID.randomUUID().toString()+originalFilename.substring(originalFilename.lastIndexOf("."));
		File file = new File(filePath+fileName);
		teaPic.transferTo(file);
		tea.setTeaPic(fileName);
		teacherService.updateTea(tea);
		return "singleCenterTea";
	}
	
	@RequestMapping("/submitWork.action")
	public String submit(Integer teaid,String endTime,Integer claid,String homeTitle,String homeInfo,MultipartFile homefile,HttpServletRequest request) throws Exception{
		String publishid = UUID.randomUUID().toString().substring(0,4);
		String fName = request.getParameter("file_name");
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
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd/ HH:mm:ss");
			String format = dateFormat.format(new Date());
			publishService.pubTaskToCla(publishid,teaid, claid, homeTitle, homeInfo, fileName, format,endTime);
		}else{
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd/ HH:mm:ss");
			String format = dateFormat.format(new Date());
			publishService.pubTaskToCla(publishid,teaid, claid, homeTitle, homeInfo, null, format,endTime);
		}
		return "redirect:/ClagradeController/getAllCla.action";
	}
	
	@RequestMapping("/getPublishByclaid.action")
	public String pigai(Integer claid,Model model){
		List<Publish> allClaPubList = publishService.getAllPubByClaid(claid);
		Clagrade clagrade = clagradeService.getClaByclaid(claid);
		model.addAttribute("clagrade", clagrade);
		model.addAttribute("allClaPubList", allClaPubList);
		return "pigai";
	}
	/*-===========================================*/
	@RequestMapping("/getHomeWorkBypubid.action")
	@ResponseBody
	public List<HomeworkVo> getHomeWorkBypubid(Integer claid,String publishid,Model model){
		List<HomeworkVo> homeworkVoList = new ArrayList<HomeworkVo>();
		List<Homework> alrSubPubList = homeWorkService.alreaySubWork(claid, publishid);
		List<Integer> subStuIds = new ArrayList<Integer>();
		if(alrSubPubList!=null){
			for(Homework homework:alrSubPubList){
				HomeworkVo homeworkVo = new HomeworkVo();
				homeworkVo.setHomework(homework);
				homeworkVo.setStudent(studentService.findStuById(homework.getReplyworkStuid()));
				homeworkVo.setFlag(1);
				homeworkVo.setPublish(publishService.getPublishBypubid(publishid));
				homeworkVoList.add(homeworkVo);
				subStuIds.add(homework.getReplyworkStuid());
			}
		}
		//针对该班级 每次的作业 未交的人
		List<Integer> AllStuIds = clagradeService.getAllStuByClaid(claid);
		AllStuIds.removeAll(subStuIds);
		for(Integer id:AllStuIds){
			HomeworkVo homeworkVo = new HomeworkVo();
			homeworkVo.setHomework(null);
			homeworkVo.setStudent(studentService.findStuById(id));
			homeworkVo.setFlag(0);
			homeworkVo.setPublish(publishService.getPublishBypubid(publishid));
			homeworkVoList.add(homeworkVo);
		}
		return homeworkVoList;
	}
	
	@RequestMapping("/solvework.action")
	public String solvework(Integer claid,String replyworkId,String file_name,String sovleInfo,HttpServletRequest request) throws Exception{
		if(replyworkId.length() <= 0){
			throw new MessageException("批改之前请选择具体作业");
		}else{
			if(file_name.length()>0){
				String fileName ="";
				if(request instanceof MultipartHttpServletRequest){
					MultipartHttpServletRequest multipartHttpServletRequest = (MultipartHttpServletRequest) request;
					Map<String, MultipartFile> map = multipartHttpServletRequest.getFileMap();
					for(Map.Entry<String, MultipartFile> entry:map.entrySet()){
						String originalFilename = entry.getValue().getOriginalFilename();
						String random = UUID.randomUUID().toString().substring(0,4);
						fileName = random+originalFilename.substring(originalFilename.lastIndexOf("."));
						File file = new File("F:\\OpointResource\\pic\\work_pic\\reply\\");
						if( !file.isDirectory()){
							file.mkdir();
						}
						String filePath = file.getAbsolutePath();
						File file1 = new File(filePath+"\\"+fileName);
						entry.getValue().transferTo(file1);
					}
				}
				Homework homework = homeWorkService.getHomeworkByrepId(replyworkId);
				homework.setSolveworkInfo(sovleInfo);
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd/ HH:mm:ss");
				String format = dateFormat.format(new Date());
				homework.setSolveworkTime(format);
				homework.setSolveworkPic(fileName);
				homework.setSolveworkState(1);
				homeWorkService.solveWorkBypublishidAndStuid(replyworkId, homework);
			}else{
				Homework homework = homeWorkService.getHomeworkByrepId(replyworkId);
				homework.setSolveworkInfo(sovleInfo);
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd/ HH:mm:ss");
				String format = dateFormat.format(new Date());
				homework.setSolveworkTime(format);
				homework.setSolveworkState(1);
				homeWorkService.solveWorkBypublishidAndStuid(replyworkId, homework);
			}
			return "forward:/TeacherController/getPublishByclaid.action?claid="+claid+"";
		}
	}
	
	@RequestMapping("/dianzan.action")
	@ResponseBody
	public String dianzan(Integer teaid){
		Integer teaAtten = teacherService.findTeaById(teaid).getTeaAtten();
		if(teaAtten == null || teaAtten == 0 ){
			Teacher tea = teacherService.findTeaById(teaid);
			tea.setTeaAtten(0);
			teaAtten = tea.getTeaAtten() +2;
			tea.setTeaAtten(teaAtten);
			teacherService.updateTea(tea);
		}else{
			Teacher tea = teacherService.findTeaById(teaid);
			Integer teaAtten2 = tea.getTeaAtten();
			teaAtten2 = teaAtten2 + 2;
			tea.setTeaAtten(teaAtten2);
			teacherService.updateTea(tea);
		}
		return "ok";
	}
}