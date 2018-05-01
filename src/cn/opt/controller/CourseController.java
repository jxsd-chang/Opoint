package cn.opt.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.opt.po.Course;
import cn.opt.service.CourseService;

@Controller
@RequestMapping("/CourseController")
public class CourseController {
	@Autowired
	private CourseService courseService;
	
	/**
	 * 得到全部课程
	 */
	@RequestMapping("/getAllCou.action")
	public String getAllCou(Model model){
		List<Course> couList = courseService.findAllCou();
		model.addAttribute("couList",couList);
		return "all_course";
	}
	
}
