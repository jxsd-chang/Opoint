package cn.opt.service;

import java.util.List;

import cn.opt.po.Paper;

public interface PaperService {
	/**
	 * 根据课程和试卷难度 查出试卷
	 *    
	 */
	public List<Paper> findPaperByCouIdAndNanDu(Integer paperType, String paperNanDu);
	
	/**
	 * 根据paid得到记录
	 */
	public Paper getPaperById(Integer id);
	/**
	 * 根据cid得到paper
	 */
	public List<Paper> getPapers(Integer cid);
	
	public List<Paper> getAllPaper();

	public void updatePa(Integer paId, int i);
	
	
	
	
}
