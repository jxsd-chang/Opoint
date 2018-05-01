package cn.opt.vo;

import cn.opt.po.Teacher;

public class TeacherQueryVo {
	private Teacher teacher;
	private Integer que_count;
	private Integer love_count;
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public Integer getQue_count() {
		return que_count;
	}
	public void setQue_count(Integer que_count) {
		this.que_count = que_count;
	}
	public Integer getLove_count() {
		return love_count;
	}
	public void setLove_count(Integer love_count) {
		this.love_count = love_count;
	}
	
}
