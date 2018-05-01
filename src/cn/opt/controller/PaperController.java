package cn.opt.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.opt.po.Paper;
import cn.opt.service.PaperService;

@Controller
@RequestMapping("/PaperController")
public class PaperController {

	@Autowired
	private PaperService paperService;
	
	@RequestMapping("/toExamPage.action")
	public String  toExamPage(HttpSession session) {
		return "selectType";
	}
	
	/**
	 * 根据课程id和试卷难度 查出试卷
	 */
	@RequestMapping("/searchPaper.action")
	@ResponseBody
	public List<Paper> searchPaper(String sel_cou, String sel_nandu, Model model){
		List<Paper> list = paperService.findPaperByCouIdAndNanDu(Integer.parseInt(sel_cou), sel_nandu);
		if(! list.isEmpty()){
			return list;
		}
		return null;
	}
}
