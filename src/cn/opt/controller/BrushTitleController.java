package cn.opt.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.opt.po.Brush;
import cn.opt.po.Kninfo;
import cn.opt.po.Knowpoint;
import cn.opt.po.Rank;
import cn.opt.po.Video;
import cn.opt.service.BrushService;
import cn.opt.service.KninfoService;
import cn.opt.service.KnowPointService;
import cn.opt.service.RankService;
import cn.opt.service.VideoService;
import cn.opt.utils.ListUtils;
import cn.opt.utils.RankIdUtils;
import cn.opt.vo.AnyVo;
import cn.opt.vo.CourseItem;
@Controller
@RequestMapping("/BrushTitleController")
public class BrushTitleController {
	
	@Autowired
	private BrushService brushService;
	@Autowired
	private VideoService videoService;
	@Autowired
	private KnowPointService knowPointService;
	@Autowired
	private RankService rankService;
	@Autowired
	private KninfoService kninfoService;
	
	/**
	 * 得到所有的刷题图片
	 */
	@RequestMapping(value="/getBrushByKpid.action",produces="application/json;charset=utf-8")
	public @ResponseBody List<Brush> togetQues(Integer kpid,Model model){
		List<Brush> list = brushService.getBrushByKpId(kpid);
		return list;
	}
	
	/**
	 * 去刷题页面
	 */
	@RequestMapping("/toBrushTitle.action")
	public String getAllTitle(Integer id,HttpSession session,Model model){
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
		//初始化错题排行榜
		List<Rank> allRank = rankService.getAllRank();
		List<Integer> kninfoIds = new ArrayList<Integer>();
		List<Integer> videoIds = new ArrayList<Integer>();
		List<Integer> brushIds = new ArrayList<Integer>();
		if(allRank!=null){
			 for(Rank rank:allRank){
				 kninfoIds.add(rank.getRankKninfoid());
				 videoIds.add(rank.getRankVideoid());
				 brushIds.add(rank.getRankBrushid());
			 }
		}
		List<Integer> kninfoList = RankIdUtils.getSortRank(kninfoIds);
		List<Integer> videoList = RankIdUtils.getSortRank(videoIds);
		List<Kninfo> knifoTitleList = new ArrayList<Kninfo>();
		List<Video> videoitemList = new ArrayList<Video>();
		for(Integer kid:kninfoList){
			knifoTitleList.add(kninfoService.getKninfoByKninfoId(kid));
		}
		for(Integer vid:videoList){
			Video video = videoService.getVideoByVid(vid);
			video.setVioItem(video.getVioItem().substring(5));
			videoitemList.add(video);
		}
		//去重
		Set<Kninfo> set = new HashSet<Kninfo>(knifoTitleList);
        List<Kninfo> knifoTitleListplus = new ArrayList<Kninfo>(set);
        
        Set<Video> set1 = new HashSet<Video>(videoitemList);
        List<Video> videoitemListplus = new ArrayList<Video>(set1);
        
		model.addAttribute("knifoTitleList", knifoTitleListplus);
		model.addAttribute("videoitemList", videoitemListplus);
		//
		session.setAttribute("courseItemsList", courseItemsList);
		return "brush_title";
	}
	/**
	 * 推荐刷题--个人中心
	 */
	@RequestMapping("/tjBrush.action")
	public String tjShuati(Integer kpid,Model model){
		Map<Map<AnyVo,List<AnyVo>>,Brush> map = new HashMap<Map<AnyVo,List<AnyVo>>, Brush>();
		List<Brush> brushWrongList = new ArrayList<Brush>();
		List<Integer> list = rankService.getEasyWrongBrushs();
		//对Integer去重
		List<Integer> listPlus = new ArrayList<Integer>();
		for(Integer ii:list){
			if(!listPlus.contains(ii)){
				listPlus.add(ii);
			}
		}
		if(listPlus!=null){
			for(Integer bid:listPlus){
				brushWrongList.add(brushService.getBrushBybrushId(bid));
			}
		}
		for(Brush bru:brushWrongList){
			Map<AnyVo,List<AnyVo>> mapinner = new HashMap<AnyVo, List<AnyVo>>();
			//主要知识点
			Knowpoint knowpoint = knowPointService.getKnowPointBykpid(bru.getKpId());
			AnyVo anyVo = new AnyVo();
			anyVo.setId(knowpoint.getKpId());
			anyVo.setTitle(knowpoint.getKpContent());
			//扩展相似知识点
			List<AnyVo> strList = new ArrayList<AnyVo>();
			List<Kninfo> list2 = kninfoService.getKninfoByKpId(bru.getKpId());
			for(Kninfo kn:list2){
				AnyVo anyVo1 = new AnyVo();
				anyVo1.setId(kn.getKninfoId());
				anyVo1.setTitle(kn.getKninfoTitle());
				strList.add(anyVo1);
			}
			mapinner.put(anyVo, ListUtils.getRepeat(strList));
			map.put(mapinner, bru);
		}
		model.addAttribute("map", map);
		
		List<Brush> list1 = brushService.getBrushByKpId(kpid);
		model.addAttribute("bruList", list1);
		return "brush_title";
	}
	/**
	 * 推荐刷题--考试模块
	 */
	@RequestMapping("/tjBrushExam.action")
	public String tjShuati1(Integer brushId,Model model){
		List<Brush> list = new ArrayList<Brush>();
		Brush brush = brushService.getBrushBybrushId(brushId);
		list.add(brush);
		model.addAttribute("bruList", list);
		return "brush_title";
	}
	
	/**
	 * 得到解析图片
	 */
	@RequestMapping("/getPaper.action")
	@ResponseBody
	public String getParse(Integer brushid,Model model){
		Brush brush = brushService.getTitleByBrushId(brushid);
		return brush.getBrushParse();
	}
}
