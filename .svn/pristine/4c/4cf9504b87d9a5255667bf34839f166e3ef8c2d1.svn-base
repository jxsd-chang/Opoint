package cn.opt.service;

import java.util.LinkedHashSet;
import java.util.List;

import cn.opt.po.CustomVideo;
import cn.opt.po.Video;

public interface VideoService {
	/**
	 *根据vioid拿到视频 
	 */
	public Video getVideoByVid(Integer vioid);
	
	/**
	 * 得到视频所有大标题
	 */
	public LinkedHashSet<String> getBigItemsByCid(Integer cid);
	
	/**
	 * 根据大标题拿到知识点item
	 */
	public List<CustomVideo> getItemsByBigTag(String btag);
	/**
	 * 得到所有视频
	 */
	public List<Video> getAllVideo();
}
