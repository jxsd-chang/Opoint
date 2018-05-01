package cn.opt.service;

import java.util.List;

import cn.opt.po.Competition;

public interface CompetitionService {

	//获得竞赛题
	public List<Competition> obtainCompetition(Integer pageNumber,Integer pageSize)throws Exception;
	
	public List<Competition> obtainAllCompetition();
}
