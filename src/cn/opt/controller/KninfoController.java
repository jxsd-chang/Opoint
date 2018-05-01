package cn.opt.controller;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.opt.po.Kninfo;
import cn.opt.service.KninfoService;

@Controller
@RequestMapping("/KninfoController")
public class KninfoController {
	
	@Autowired
	private KninfoService kninfoService;
	
	
	@RequestMapping(value="/getKninfoByKpId.action",produces="application/json;charset=UTF-8")
	@ResponseBody
	public List<Kninfo> getKninfoByKpId(Integer kpId,Model model){
		List<Kninfo> kp_list = kninfoService.getKninfoByKpId(kpId);
		return kp_list;
	}
	
	@RequestMapping("/tjKnifo.action")
	public String tjKnifo(Integer knifoid,Model model){
		List<Kninfo> list = new ArrayList<Kninfo>();
		Kninfo kninfo = kninfoService.getKninfoByKninfoId(knifoid);
		list.add(kninfo);
		model.addAttribute("knifoList", list);
		return "showKnowPoint";
	}
}



