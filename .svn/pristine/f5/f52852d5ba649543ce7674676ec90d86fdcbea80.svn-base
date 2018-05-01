package cn.opt.service;


import java.util.List;

import cn.opt.po.ConnStuTea;

public interface ConnStuTeaService {
	/**
	 * 增加一条提问消息
	 */
	public void addAskMessageByStuTea(ConnStuTea  connStuTea);
	/**
	 * 删除一条信息
	 */
	public void delAskMessageByaskId(Integer askid);
	/**
	 * 回答提问消息
	 */
	public void replyAskMessage(Integer askid,String solveinfo,String askTime,Integer states);
	/**
	 * 根据sid和tid
	 */
	public List<ConnStuTea> getAttenBtSidAndTid(Integer sid,Integer tid);
	/**
	 * 学生所关注的老师
	 */
	public List<ConnStuTea> getAttenBySid(Integer sid,Integer isatten);
	/**
	 * 查询学生受到老师的回复消息
	 */
	public List<ConnStuTea> getTeaReplyMessage(Integer sid,Integer states);
	/**
	 * 更新
	 */
	public void updateAskStuTea(ConnStuTea connStuTea);
	public void quAtten(Integer sid, Integer tid);
}
