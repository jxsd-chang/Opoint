package cn.opt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.opt.po.Competition;
import cn.opt.service.CompetitionService;

@Controller
@RequestMapping("/CompetitionController")
public class CompetitionController {
	
	@Autowired
	private CompetitionService competitionService;
	
	@RequestMapping("/enterCompetionPage.action")
	public ModelAndView enterCompetionPage(Integer pageNumber,Integer pageSize) throws Exception{
		ModelAndView modelAndView=new ModelAndView();
		pageNumber=(pageNumber-1)*3;
		List<Competition> list=competitionService.obtainCompetition(pageNumber,pageSize);
		List<Competition> listAll=competitionService.obtainAllCompetition();
		int size=listAll.size();
		int flag=size%pageSize;
		int page;
		if(flag==0){
			page=size/pageSize;
		}else{
			page=size/pageSize+1;
		}
		modelAndView.addObject("list", list);
		modelAndView.addObject("page", page);
		modelAndView.addObject("pageNumber", pageNumber);	
		modelAndView.setViewName("tiaozhan");
		return modelAndView;
	}
	
	@RequestMapping("/yibuCompetionPage.action")
	public @ResponseBody List<Competition> yibuCompetionPage(Integer pageNumber,Integer pageSize) throws Exception{
		pageNumber=(pageNumber-1)*3;
		List<Competition> list=competitionService.obtainCompetition(pageNumber,pageSize);
		return list;
	}
}
