package cn.opt.service;

import java.util.List;

import cn.opt.po.Comment;

public interface CommentService {
	/**
	 * 查看所有评论
	 */
	public List<Comment> getAllComm(Integer knifoid);
	
	/**
	 * 学生发表评论
	 */
	public void publishComm(Integer stuid,Integer knifoid,String commInfo,String pubTime);
	/**
	 * 老师发表评论
	 */
	public void publishCommTea(Integer teaid,Integer knifoid,String commInfo,String pubTime);
}
