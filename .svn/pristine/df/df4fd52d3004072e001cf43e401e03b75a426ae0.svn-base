package cn.opt.controller;

import cn.opt.po.Admin;
import cn.opt.po.Clagrade;
import cn.opt.po.ConnStuTea;
import cn.opt.po.Student;
import cn.opt.po.Teacher;
import cn.opt.service.ClagradeService;
import cn.opt.service.ConnStuTeaService;
import cn.opt.service.ExamService;
import cn.opt.service.StudentService;
import cn.opt.service.TeacherService;
import cn.opt.service.UserService;
import cn.opt.utils.IndustrySMS;
import cn.opt.utils.RandonNum;
import cn.opt.vo.AskQueVo;
import cn.opt.vo.ClagradeItem;
import cn.opt.vo.RegisterVo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "/UserController" })
public class UserController {

	@Autowired
	private UserService userService;
	@Autowired
	private StudentService stuService;
	@Autowired
	private TeacherService teaService;
	@Autowired
	private ClagradeService clagradeService;
	@Autowired
	private ConnStuTeaService connStuTeaService;
	@Autowired
	private ExamService examService;

	@RequestMapping("/regist.action")
	public String register(RegisterVo registerVo,Model model,HttpSession session) throws Exception {
		if(registerVo.getUsertele().equals("") || registerVo.getPassword().equals("")){
			return "register";
		}
		if(registerVo.getCode().equals(RandonNum.code)){
			String jus = registerVo.getJus();
			if(jus.equals("s")){
				//学生
				Integer flag = userService.isExitTel(registerVo.getUsertele());
				if(flag != 2){
					this.userService.register(registerVo.getJus(), registerVo.getUsertele(), registerVo.getPassword());
				}else{
					model.addAttribute("stuIsExit", "您已注册，请勿重复注册！");
					return "register";
				}
				Student stu = new Student();
				stu.setStuTel(registerVo.getUsertele());
				session.setAttribute("student", stu);
			}else{
				//老师
				Integer flag = userService.isExitTel(registerVo.getUsertele());
				if(flag != 1){
					this.userService.register(registerVo.getJus(), registerVo.getUsertele(), registerVo.getPassword());
				}else{
					model.addAttribute("teaIsExit", "您已注册，请勿重复注册！");
					return "register";
				}
				Teacher tea = new Teacher();
				tea.setTeaTel(registerVo.getUsertele());
				session.setAttribute("teacher", tea);
			}
			return "index";
		}else{
			model.addAttribute("yanzeng", "输入验证码错误");
			return "register";
		}
	}

	@RequestMapping({ "/login.action" })
	public String login(String jus, String userphone, String userpwd, String vcode, Model model, HttpSession session) throws Exception {
		String autoCode = (String) session.getAttribute("key");
		if (!(vcode.equalsIgnoreCase(autoCode))) {
			model.addAttribute("codemsg", "验证码输入错误");
			return "login";
		}
		if (jus.equals("s")) {
			Student sLogin = this.userService.s_login(jus, userphone, userpwd);
			if (sLogin == null) {
				model.addAttribute("errmsg", "输入的手机号或密码错误，请核对后重新输入。");
				return "login";
			}
			session.setAttribute("student", sLogin);
			return "index";
		}

		Teacher tLogin = this.userService.t_login(jus, userphone, userpwd);
		if (tLogin == null) {
			model.addAttribute("errmsg", "输入的手机号或密码错误，请核对后重新输入。");
			return "login";
		}
		session.setAttribute("teacher", tLogin);
		return "index";
	}

	@RequestMapping({ "/adminlogin.action" })
	public String adminLogin(String adminnick, String admintel, String adminpwd, Model model, HttpSession session) {
		Admin aLogin = this.userService.a_login(admintel, adminpwd);
		if (aLogin == null) {
			model.addAttribute("errmsg", "账号输入错误，请重新输入");
			return "forward:/admin_login.jsp";
		}
		aLogin.setAdmName(adminnick);
		session.setAttribute("admin", aLogin);
		return "redirect:/admin_index.jsp";
	}
/**
 * 忘记密码
 * @throws Exception 
 */
	@RequestMapping({ "/forgetpwd.action" })
	public String forgetpwd(String phone, String code,String pwd, Model model, HttpServletRequest request) throws Exception {
		
		if(code.equals(RandonNum.code)){
			Integer flag = this.userService.isExitTel(phone);
			System.out.println(flag);
			if (flag.intValue() == 1) {
				Teacher teacher = this.teaService.findTeaByTel(phone);
				this.teaService.updatePwd(teacher.getTeaId(), pwd);
				model.addAttribute("succ", "重置密码成功<a href="+request.getContextPath()+"/login.action>前去登录</a>");
			} else if (flag.intValue() == 2) {
				this.stuService.updatePwd(this.stuService.findStuByTel(phone).getStuId(), pwd);
				model.addAttribute("succ", "重置密码成功<a href="+request.getContextPath()+"/login.action>前去登录</a>");
			} else if(flag.intValue() == 3){
				model.addAttribute("succ", "你手机号存在安全隐患,建议重新注册");
			}else{
				model.addAttribute("succ", "该用户手机号不存在");
			}
			return "forgetPwd";
		}else{
			model.addAttribute("yanzeng", "输入验证码错误");
			return "forgetPwd";
		}
	}

	@RequestMapping(value="/resetpwd.action",produces="application/text;charset=utf-8")
	public @ResponseBody String adm_resetpwd(String admid,String password){
		userService.resetpwd(Integer.parseInt(admid), password);
		String succ = "重置密码成功";
		return succ;
	}
	
	@RequestMapping({ "/exitUser.action" })
	public String toLoginPage(HttpSession session) {
		session.invalidate();
		return "login";
	}
	@RequestMapping("/adm_logout.action")
	public String adm_logout(HttpSession session) {
		session.invalidate();
		return "redirect:/admin_login.jsp";
	}
	
	@RequestMapping("/singleCenter.action")
	public String toSingleCenter(HttpSession session,Model model){
		Student student = (Student) session.getAttribute("student");
		if(student==null){
			return "login";
		}
		Student stu = stuService.findStuById(student.getStuId());
		//我的消息
		List<ConnStuTea> teaRepList = connStuTeaService.getTeaReplyMessage(stu.getStuId(), 1);
		List<AskQueVo> askQueVos = new ArrayList<AskQueVo>();
		if(teaRepList!=null){
			for(ConnStuTea st:teaRepList){
				AskQueVo askQueVo = new AskQueVo();
				askQueVo.setConnStuTea(st);
				askQueVo.setStuName(stuService.findStuById(stu.getStuId()).getStuName());
				askQueVo.setTeaName(teaService.findTeaById(st.getTeaId()).getTeaName());
				askQueVos.add(askQueVo);
			}
		}
		
		//系统消息
		List<ConnStuTea> list = connStuTeaService.getAttenBySid(stu.getStuId(), 1);
		List<ClagradeItem> clagradeItems = new ArrayList<ClagradeItem>();
		if(list !=null){
			for(ConnStuTea conn:list){
				Teacher teacher = teaService.findTeaById(conn.getTeaId());
				ClagradeItem clagradeItem = new ClagradeItem();
				clagradeItem.setTeacher(teacher);
				List<Clagrade> clagradeList = clagradeService.getClagradeList(teacher.getTeaId());
				if(clagradeList != null){
					clagradeItem.setClaList(clagradeList);
				}
				clagradeItems.add(clagradeItem);
			}
		}
		//班级数
		int claCounts = clagradeService.getClaCounts(student.getStuId());
		List<ConnStuTea> attenBySid = connStuTeaService.getAttenBySid(student.getStuId(), 1);
		Set<Integer> tids = new HashSet<Integer>();
		//关注数
		int attenCounts = 0;
		if(attenBySid !=null){
			for(ConnStuTea conn:attenBySid){
				tids.add(conn.getTeaId());
			}
			attenCounts = tids.size();
		}
		//考试次数
		//提问数
		
		Integer examCounts = examService.examCountsBysid(student.getStuId());
		model.addAttribute("claCounts", claCounts);
		model.addAttribute("attenCounts", attenCounts);
		model.addAttribute("examCounts", examCounts);
		model.addAttribute("myMesCount", askQueVos.size());
		model.addAttribute("teaRepList", askQueVos);
		model.addAttribute("clagradeItems", clagradeItems);
		model.addAttribute("student", stu);
		model.addAttribute("sysMesCount", clagradeItems.size());
		return "singleCenter";
	}
	
	@RequestMapping("/singleCenterTea.action")
	public String singleCenterTea(HttpSession session,Model model){
		Teacher teacher = (Teacher) session.getAttribute("teacher");
		if(teacher==null){
			return "login";
		}
		Teacher tea = teaService.findTeaById(teacher.getTeaId());
		//班级数 
		List<Clagrade> list = clagradeService.getClagradeList(tea.getTeaId());
		int claCount = 0;
		int sumCount = 0;
		if(list != null){
			claCount = list.size();
			for(Clagrade cla:list){
				
				List<Integer> list2 = clagradeService.getAllStuByClaid(cla.getClaId());
				if(list2 != null){
					sumCount += list2.size();
				}
			}
		}
		model.addAttribute("claCount", claCount);
		model.addAttribute("sumCount", sumCount);
		model.addAttribute("teacher", tea);
		return "singleCenterTea";
	}
	/**
	 * 发送验证码
	 */
	@RequestMapping("/MessYanZheng.action")
	@ResponseBody
	public void MessYanZheng(String phone){
		RandonNum randonNum = new RandonNum();
		RandonNum.code = randonNum.getCode();
		IndustrySMS.execute(phone, RandonNum.code);
	}
}