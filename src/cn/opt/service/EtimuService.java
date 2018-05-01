package cn.opt.service;

import java.util.List;

import com.github.pagehelper.PageInfo;

import cn.opt.po.Competition;
import cn.opt.po.Etimu;

public interface EtimuService {
	/**
	 * 根据pid找到试卷所有试题
	 */
	public List<Etimu> getAllTiMu(Integer id);
	
	/**
	 * 通过pid和etimuType得到选择题答案
	 */
	public List<Etimu> getOptAnswer(Integer pid, Integer type);
	
	/**
	 * 得到全部竞赛题
	 */
	public PageInfo<Competition> getAllCompeList();
	/**
	 * 得到错题
	 */
	public List<Etimu> wrongList(Integer brushid);
}
