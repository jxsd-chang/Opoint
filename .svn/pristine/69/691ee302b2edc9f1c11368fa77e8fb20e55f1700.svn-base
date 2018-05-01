package cn.opt.controller;


import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.opt.po.Clagrade;
import cn.opt.po.Student;
import cn.opt.po.Teacher;
import cn.opt.service.ClagradeService;
import cn.opt.service.StudentService;

@Controller
@RequestMapping("/ClagradeController")
public class ClagradeController {

	@Autowired
	private ClagradeService clagradeService;
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/getAllCla.action")
	public String getAllCla(Model model,HttpSession session){
		Teacher tea = (Teacher) session.getAttribute("teacher");
		if(tea==null){
			return "login";
		}
		List<Clagrade> clagradeList = clagradeService.getClagradeList(tea.getTeaId());
		model.addAttribute("claList", clagradeList);
		return "class_index";
		
	}
	@RequestMapping("/getClaByClaid.action")
	@ResponseBody
	public Clagrade getClabyid(Integer claid){
		return clagradeService.getClaByclaid(claid);
	}
	
	@RequestMapping("/createCla.action")
	public String createCla(Clagrade claCapacity,Model model){
		if(claCapacity.getTeaId()!=null){
			clagradeService.createNewCla(claCapacity.getTeaId(),claCapacity.getClaNo(),claCapacity.getClaName(),claCapacity.getClaCapacity(),claCapacity.getClaIntro());
			return "redirect:/ClagradeController/getAllCla.action";
		}else{
			return "login";
		}
	}
	
	@RequestMapping("/deleCla.action")
	@ResponseBody
	public String deleCla(Integer claid){
		boolean flag = clagradeService.deleCla(claid);
		if(flag == true){
			return "ok";
		}else{
			return "no";
		}
	}
	
	@RequestMapping("/toupdateCla.action")
	@ResponseBody
	public Clagrade toupdateCla(Integer claid,Model model){
		return clagradeService.getClaByclaid(claid);
	}
	
	@RequestMapping("/updateCla.action")
	public String updateCla(Clagrade clagrade){
		clagradeService.updateCla(clagrade.getClaId(), clagrade);
		return "redirect:/ClagradeController/getAllCla.action";
	}
	@RequestMapping("/stuJoinCla.action")
	@ResponseBody
	public String joinCla(Integer sid,Integer claid){
		if(clagradeService.isExitStuFromCla(sid, claid)){
			return "no";
		}else{
			clagradeService.joinCla(sid, claid);
			return "yes";
		}
	}
	
	@RequestMapping("/getstuListByclaid.action")
	@ResponseBody
	public List<Student> getstuLIst(Integer claid){
		List<Student> stuList = new ArrayList<Student>();
		List<Integer> sidList = clagradeService.getAllStuByClaid(claid);
		if(sidList !=null){
			for(Integer id:sidList){
				stuList.add(studentService.findStuById(id));
			}
			return stuList;
		}
		return null;
	}
	
}
