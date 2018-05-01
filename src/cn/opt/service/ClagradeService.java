package cn.opt.service;

import java.util.List;

import cn.opt.po.Clagrade;

public interface ClagradeService {
	/**
	 * 显示老师相应班级列表
	 */
	public List<Clagrade> getClagradeList(Integer teaid);
	/**
	 * 创建新班级
	 */
	public void createNewCla(Integer teaid, Integer claNo,String claName, Integer claCapacity, String claIntro);
	
	public boolean deleCla(Integer claid);
	
	/**
	 * 修改班级信息
	 */
	public void updateCla(Integer claid,Clagrade clagrade);
	public Clagrade getClaByclaid(Integer claid);
	
	/**
	 * 学生加入该班级
	 */
	public void joinCla(Integer sid,Integer claid);
	/**
	 * 判断该学生是否在该班级
	 */
	public boolean isExitStuFromCla(Integer sid,Integer claid);
	
	/**
	 * 获取该班级所有学生
	 */
	public List<Integer> getAllStuByClaid(Integer claid);
	
	/**
	 * 得到该学生加入的班级数
	 */
	public int getClaCounts(Integer stuid);
}
