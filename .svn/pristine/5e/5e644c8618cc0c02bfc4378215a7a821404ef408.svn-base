package cn.opt.service;

import java.util.List;

import cn.opt.po.Brush;
import cn.opt.po.Kninfo;
import cn.opt.po.Video;

public interface CollectService {
	/**
	 * 收藏视频
	 */
	public void scVideo(Integer stuid,Integer vid);
	/**
	 * 取消收藏视频
	 */
	public void qxVideo(Integer vid);
	/**
	 * 收藏知识点
	 */
	public Boolean scKnowPoint(Integer stuid,Integer kninfoid);
	
	/**
	 * 取消收藏知识点
	 */
	public void qxKnowPoint(Integer kninfoid);
	
	/**
	 * 判断重复收藏知识点
	 */
	public Boolean isExitscKnowPoint(Integer stuid,Integer kninfoid);
	
	/**
	 * 收藏刷题
	 */
	public Boolean scBrushTitle(Integer stuid,Integer brushid);
	
	/**
	 * 取消收藏刷题
	 */
	public void qxBrushTitle(Integer brushid);
	/**
	 * 判断重复收藏刷题
	 */
	public Boolean isExitscBrushTitle(Integer stuid,Integer brushid);
	
	
	
	
	/**
	 * 得到收藏视频列表
	 */
	public List<Video> getVideoList(Integer stuid,Integer flag);
	
	/**
	 * 得到收藏知识点列表
	 */
	public List<Kninfo> getKnowPointList(Integer stuid,Integer flag);
	
	/**
	 * 得到收藏刷题列表
	 */
	public List<Brush> getBrushList(Integer stuid,Integer flag);
	
	
}
