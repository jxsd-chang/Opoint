package cn.opt.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.opt.mapper.PaperMapper;
import cn.opt.po.Paper;
import cn.opt.po.PaperExample;
import cn.opt.po.PaperExample.Criteria;
import cn.opt.service.PaperService;
@Service
public class PaperServiceImpl implements PaperService {
	@Autowired
	private PaperMapper paperMapper;

	@Override
	public List<Paper> findPaperByCouIdAndNanDu(Integer paperType, String paperNanDu){
		List<Paper> list = null;
		PaperExample example = new PaperExample();
		Criteria criteria = example.createCriteria();
		if(paperType == 0){
			criteria.andPaNanduEqualTo(paperNanDu);
			list = paperMapper.selectByExample(example);
			return list;
		}
		if(paperNanDu.equals("0")){
			criteria.andCouIdEqualTo(paperType);
			list = paperMapper.selectByExample(example);
			return list;
		}
		criteria.andPaNanduEqualTo(paperNanDu);
		criteria.andCouIdEqualTo(paperType);
		list = paperMapper.selectByExample(example);
		return list;
	}
	/**
	 * 根据id得到paper
	 */
	public Paper getPaperById(Integer id){
		Paper paper = paperMapper.selectByPrimaryKey(id);
		return paper;
	}
	@Override
	public List<Paper> getPapers(Integer cid) {
		PaperExample example = new PaperExample();
		Criteria criteria = example.createCriteria();
		criteria.andCouIdEqualTo(cid);
		return paperMapper.selectByExample(example);
	}
	
	public List<Paper> getAllPaper(){
		return paperMapper.selectByExample(null);
	}
	@Override
	public void updatePa(Integer paId, int count) {
		Paper paper = new Paper();
		paper.setPaId(paId);
		paper.setPaCount(count);
		paperMapper.updateByPrimaryKeySelective(paper);
	}

}
