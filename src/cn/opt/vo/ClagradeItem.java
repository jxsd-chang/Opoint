package cn.opt.vo;

import java.util.List;

import cn.opt.po.Clagrade;
import cn.opt.po.Teacher;

public class ClagradeItem {
	
	private Teacher teacher;
	
	private List<Clagrade> claList;

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public List<Clagrade> getClaList() {
		return claList;
	}

	public void setClaList(List<Clagrade> claList) {
		this.claList = claList;
	}
	
	
	
}
