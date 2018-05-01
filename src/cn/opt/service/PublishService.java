package cn.opt.service;

import java.util.List;

import cn.opt.po.Publish;
import cn.opt.vo.PublishVo;

public interface PublishService {
	/**
	 * 该老师给哪个班级发布作业
	 */
	public void pubTaskToCla(String publishid,Integer teaid,Integer claid,String pubTitle,String pubInfo,String pubPic,String pubTime,String endTime);
	/**
	 * 得到该班级所有的作业
	 */
	public List<Publish> getAllPubByClaid(Integer claid);
	
	
	/**
	 * 该学生的作业
	 */
	public List<PublishVo> getHomeWorkList(Integer sid);
	
	public Publish getPublishBypubid(String publishid);
}
