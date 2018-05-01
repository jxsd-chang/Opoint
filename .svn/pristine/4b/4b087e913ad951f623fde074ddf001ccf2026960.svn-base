package cn.opt.controller;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.opt.po.Course;
import cn.opt.po.Knowpoint;
import cn.opt.service.CourseService;
import cn.opt.service.KnowPointService;
import cn.opt.vo.CourseItem;

@Controller
@RequestMapping("/KnowPointController")
public class KnowPointController {
	
	@Autowired
	private KnowPointService knowPointService;
	
	@Autowired
	private CourseService courseService;
	
	/**
	 * 得到全部课程分类
	 */
	@RequestMapping("/getAllCou.action")
	public String getAllCou(HttpSession session){
		List<Course> couList = courseService.findAllCou();
		session.setAttribute("couList",couList);
		return "showKnowPoint";
	}
	/**
	 * 得到所有该课程的知识点的所有大标题
	 * @return 
	 */
	@RequestMapping("/getAllBigTagByCid.action")
	public String getAllBigTagByCid(String cid,HttpSession session){
		Set<String> setTag = knowPointService.getBigTitleByCid(Integer.parseInt(cid));
		String couName = courseService.getCourseById(Integer.parseInt(cid)).getCouName();
		session.setAttribute("cid", Integer.parseInt(cid));
		session.setAttribute("couName", couName);
		session.setAttribute("setTag", setTag);
		return "showKnowPoint";
		
	}
	/**
	 * 根大标签拿到知识点内容
	 */
	@RequestMapping("/getContentByTag.action")
	public String getContentByTag(String tag,HttpSession session){
		List<Knowpoint> KpList = knowPointService.getContentByTag(tag);
		session.setAttribute("tag", tag);
		session.setAttribute("KpList", KpList);
		return "showKnowPoint";
	}
	/**
	 *	去观看视频页面
	 */
	@RequestMapping("/toViewVideo.action")
	public String toViewVideo(String kpid,Model model){
		Integer id = Integer.parseInt(kpid);
		String video_Name = id+".mp4";
		model.addAttribute("video_Name", video_Name);
		return "tjvideo";
	}
	/**
	 * 去知识点页面
	 */
	@RequestMapping("/toKnowPointView.action")
	public String getKpItem(Integer id ,Model model,HttpSession session){
		LinkedHashSet<String> setTag = null;
			setTag = knowPointService.getBigTitleByCid(id);
		
		List<String> setList = new ArrayList<String>();
		for(String tag:setTag){
			setList.add(tag);
		}
		List<CourseItem> courseItemsList = new ArrayList<CourseItem>();
		CourseItem courseItem = null;
		for(String ss:setList){
			courseItem = new CourseItem();
			courseItem.setBigTag(ss);
			List<Knowpoint> list = knowPointService.getContentByTag(ss);
			List<Knowpoint> litKpList = new ArrayList<Knowpoint>();
			for(Knowpoint kp:list){
				Knowpoint knowpoint = new Knowpoint();
				String content = kp.getKpContent();
				knowpoint.setKpContent(content);
				knowpoint.setKpId(kp.getKpId());
				knowpoint.setCouId(id);
				litKpList.add(knowpoint);
			}
			courseItem.setLitKpList(litKpList);
			courseItemsList.add(courseItem);
		}
		session.setAttribute("courseItemsList", courseItemsList);
		return "showKnowPoint";
	}
	/**
	 * 搜索知识点
	 */
	@RequestMapping("/searchKp.action")
	@ResponseBody
	public List<Knowpoint> searchKp(String ss_con){
		List<Knowpoint> mhSerList = knowPointService.mohuSearchKp(ss_con);
		return mhSerList;
	}
}
