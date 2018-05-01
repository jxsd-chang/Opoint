package cn.opt.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.opt.po.Note;
import cn.opt.po.Student;
import cn.opt.service.NoteService;

@Controller
@RequestMapping("/NoteController")
public class NoteController {
	
	
	@Autowired
	private NoteService noteService;
	
	/**
	 * 查看笔记
	 */
	@RequestMapping("/showNote.action")
	@ResponseBody
	public List<Note> showNote(HttpSession session,Integer brushid){
		Student stu =  (Student) session.getAttribute("student");
		return  noteService.getAllNote(stu.getStuId(), brushid);
	}
	
	/**
	 * 写笔记
	 */
	@RequestMapping(value="/writeNote.action",produces="application/text;charset=utf-8")
	@ResponseBody
	public String writeNote(HttpSession session,Integer brushId,String noteInfo){
		Student stu = (Student) session.getAttribute("student");
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String format = dateFormat.format(new Date());
		noteService.writeNote(stu.getStuId(), brushId, noteInfo, format);
		return "记录成功";
	}
}
