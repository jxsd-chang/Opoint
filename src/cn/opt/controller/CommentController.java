package cn.opt.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.opt.po.Comment;
import cn.opt.po.Student;
import cn.opt.po.Teacher;
import cn.opt.service.CommentService;
import cn.opt.service.StudentService;
import cn.opt.service.TeacherService;
import cn.opt.vo.CommentVo;

@Controller
@RequestMapping("/CommentController")
public class CommentController {

	@Autowired
	private CommentService commentService;
	
	@Autowired
	private StudentService studentService;
	@Autowired
	private TeacherService teacherService;
	/**
	 * 查看评论
	 */
	@RequestMapping("/showComm.action")
	@ResponseBody
	public List<CommentVo> showComm(Integer knifoid,Model model,HttpSession session){
		List<Comment> commList = commentService.getAllComm(knifoid);
		List<CommentVo> commentVoList = new ArrayList<CommentVo>();
		for (Comment comment : commList) {
			CommentVo commentVo = new CommentVo();
			if(comment.getCommUser()!=null){
				Student student = studentService.findStuById(comment.getCommUser());
				if(student.getStuName() == null){
					commentVo.setComm_Name(student.getStuTel());
				}
				commentVo.setComm_Name(student.getStuName());
				commentVo.setUser_pic(student.getStuPic());
				if(student.getStuPro() != null){
					commentVo.setStu_pro(student.getStuPro());
				}
			}else{
				Teacher teacher = teacherService.findTeaById(comment.getCommUserTea());
				if(teacher.getTeaName() == null){
					commentVo.setComm_Name(teacher.getTeaTel());
				}
				//装饰name
				commentVo.setComm_Name(teacher.getTeaName());
				commentVo.setUser_pic(teacher.getTeaPic());
				commentVo.setStu_pro("");
			}
			commentVo.setComment(comment);
			commentVoList.add(commentVo);
		}
		return commentVoList;
	}
	/**
	 * 发表评论
	 */
	@RequestMapping(value="/pubComm.action",produces="application/text;charset=utf-8")
	@ResponseBody
	public String publicComm(HttpSession session,Integer knifoid,String commInfo){
		Student stu = (Student) session.getAttribute("student");
		Teacher tea = (Teacher) session.getAttribute("teacher");
		if(stu != null){
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd/ HH:mm:ss");
			String format = dateFormat.format(new Date());
			commentService.publishComm(stu.getStuId(), knifoid, commInfo, format);
			return "评论成功";
		}
		if(tea != null){
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd/ HH:mm:ss");
			String format = dateFormat.format(new Date());
			commentService.publishCommTea(tea.getTeaId(), knifoid, commInfo, format);
			return "评论成功";
		}
		return "err";
			
		
	}
}
