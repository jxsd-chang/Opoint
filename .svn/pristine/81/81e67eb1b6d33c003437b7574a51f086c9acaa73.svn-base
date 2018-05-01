package cn.opt.service;


import java.util.List;


import cn.opt.po.Exam;
import cn.opt.vo.ExamVo;

public interface ExamService {
	/**
	 * 增加一条考试item
	 */
	public void addRecord(Exam ex);
	/**
	 * 得到所有考试item
	 */
//	public List<ExamVo> getExamsByTid(Integer tid,Integer currPage,Integer pageSize);
	public List<ExamVo> getExamsByTid(Integer tid);
	/**
	 * 得到考试记录数
	 */
	public int getexamCounts();
	
	//得到考试
	public Exam getExamByExid(String exid);
	
	//更改状态
	public void updateState(String exid);
	//更新
	public void updateExam(String exid,Exam exam);
	/**
	 * 考试总次数
	 */
	public Integer examCountsBysid(Integer sid);
	
	public List<Exam> getExamListBysid(Integer sid);
	public List<Exam> getExamListBysidAndpid(Integer sid,Integer pid);
	/**
	 * 考这张试卷多少次
	 */
	public Integer paperCountsBysidAndpid(Integer sid,Integer pid);
}