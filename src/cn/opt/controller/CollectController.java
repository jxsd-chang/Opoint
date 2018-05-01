package cn.opt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.opt.po.Brush;
import cn.opt.po.Kninfo;
import cn.opt.po.Video;
import cn.opt.service.CollectService;

@Controller
@RequestMapping("/CollectController")
public class CollectController {

	@Autowired
	private CollectService collectService;
	
	/**
	 * 收藏视频
	 */
	@RequestMapping(value="/scvideo.action",produces="application/text;charset=utf-8")
	@ResponseBody
	public void scvideo(Integer stuid,Integer vid){
		collectService.scVideo(stuid, vid);
	}
	/**
	 * 取消收藏视频
	 */
	@RequestMapping(value="/qxvideo.action")
	@ResponseBody
	public void qxvideo(Integer vid){
		collectService.qxVideo(vid);
	}
	
	/**
	 * 收藏知识点
	 */
	@RequestMapping(value="/scknowpoint.action",produces="application/text;charset=utf-8")
	public @ResponseBody String scknowpoint(Integer stuid,Integer kninfoid){
		if(collectService.scKnowPoint(stuid, kninfoid)){
			return "收藏成功";
		}
		return "请勿重复收藏";
	}
	
	/**
	 * 取消收藏知识点
	 */
	@RequestMapping(value="/qxknowpoint.action")
	@ResponseBody
	public void qxknowpoint(Integer kninfoid){
		collectService.qxKnowPoint(kninfoid);
	}
	
	/**
	 * 收藏刷题
	 */
	@RequestMapping(value="/scbrush.action",produces="application/text;charset=utf-8")
	public @ResponseBody String scbrush(Integer stuid,Integer brushid){
		if(collectService.scBrushTitle(stuid, brushid)){
			return "收藏成功";
		}
		return "请勿重复收藏";
	}
	
	/**
	 * 取消收藏刷题
	 */
	@RequestMapping(value="/qxbrush.action")
	@ResponseBody
	public void qxbrush(Integer brushid){
		collectService.qxBrushTitle(brushid);
	}
	
	/**
	 * 得到视频列表 flag==1
	 */
	@RequestMapping("/getVideoList.action")
	@ResponseBody
	public List<Video> getVideoList(Integer stuid){
		return collectService.getVideoList(stuid, 1);
	}
	
	/**
	 * 得到知识点列表flag==2
	 */
	@RequestMapping("/getknowPointList.action")
	public @ResponseBody List<Kninfo> getknowPointList(Integer stuid){
		List<Kninfo> knowPointList = collectService.getKnowPointList(stuid, 2);
		return knowPointList;
	}
	
	/**
	 * 得到刷题列表flag==3
	 */
	@RequestMapping("/getbrushList.action")
	public @ResponseBody List<Brush> getbrushList(Integer stuid){
		List<Brush> brushList = collectService.getBrushList(stuid, 3);
		return brushList;
	}
	
}
