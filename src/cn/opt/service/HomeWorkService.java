package cn.opt.service;

import java.util.List;

import cn.opt.po.Homework;
import cn.opt.vo.HomeworkVo;

public interface HomeWorkService {
	/**
	 * 学生完成班级作业
	 */
	public void submitClaWork(Homework homework);
	
	/**
	 * 该班级这个作业  已经上交的人
	 */
	public List<Homework> alreaySubWork(Integer claid,String publishid);
	/**
	 * 老师批改学生的解答
	 */
	public void solveWorkBypublishidAndStuid(String replyworkId,Homework homework);
	
	public Homework getHomeworkByrepId(String replyworkId);
	/**
	 * 查看该学生所有的作业
	 */
	public List<HomeworkVo> getAllHomeWorksByStuid(Integer stuid);
	/**
	 * 查看该学生一个作业
	 */
	public HomeworkVo getHomeWorksByReplyWorkId(String replyworkid);
}
