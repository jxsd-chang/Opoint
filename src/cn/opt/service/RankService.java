package cn.opt.service;

import java.util.List;

import cn.opt.po.Rank;

public interface RankService {
	/**
	 * 增加一条错题记录
	 */
	public void addRank(Rank rank);
	
	/**
	 * 得到所有记录数
	 */
	public List<Rank> getAllRank();
	/**
	 * 得到错题
	 */
	public List<Integer> getEasyWrongBrushs();
}
