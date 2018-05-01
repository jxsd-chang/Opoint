package cn.opt.service;

import java.util.List;

import cn.opt.po.Note;

public interface NoteService {
	/**
	 * 记笔记功能
	 */
	public void writeNote(Integer noteUser, Integer brushId,String noteInfo,String noteTime);
	
	/**
	 * 查看所有笔记
	 */
	public List<Note> getAllNote(Integer noteUser,Integer brushid);
}
