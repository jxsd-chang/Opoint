package cn.opt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.opt.po.Exercise;
import cn.opt.service.ExerciseService;

@Controller
@RequestMapping("/ExerciseController")
public class ExerciseController {

	@Autowired
	private ExerciseService exerciseService;
	
	@RequestMapping("/click.action")
	@ResponseBody
	public List<Exercise> click(Model model,Integer count){
		return  exerciseService.getRandomExercise(count);
	}
	
}
