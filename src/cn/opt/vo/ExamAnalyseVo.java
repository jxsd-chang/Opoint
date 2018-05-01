package cn.opt.vo;

import java.util.ArrayList;
import java.util.List;

import cn.opt.po.Etimu;
import cn.opt.po.Paper;

public class ExamAnalyseVo {
	//选择题答案
	private List<OptionItem> list = new ArrayList<OptionItem>();
	//本试卷信息
	private Paper paper;
	private List<Etimu> listOpt;
	public List<OptionItem> getList() {
		return list;
	}
	public void setList(List<OptionItem> list) {
		this.list = list;
	}
	public Paper getPaper() {
		return paper;
	}
	public void setPaper(Paper paper) {
		this.paper = paper;
	}
	public List<Etimu> getListOpt() {
		return listOpt;
	}
	public void setListOpt(List<Etimu> listOpt) {
		this.listOpt = listOpt;
	}
}