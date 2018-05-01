package cn.opt.service;

import java.util.LinkedHashSet;
import java.util.List;

import cn.opt.po.Knowpoint;

public interface KnowPointService {
	/**
	 * 根据课程id得到该课程所有知识点目录结构
	 */
	public List<Knowpoint> getPointItem(Integer id);

	/**
	 * 得到所有该课程的知识点的所有大标题
	 */
	public LinkedHashSet<String> getBigTitleByCid(Integer cid);
	/**
	 * 根据tag拿到知识点内容
	 */
	public List<Knowpoint> getContentByTag(String tag);
	/**
	 * 模糊查询知识点
	 */
	public List<Knowpoint> mohuSearchKp(String content);
	public Knowpoint getKnowPointBykpid(Integer kpid);
}
