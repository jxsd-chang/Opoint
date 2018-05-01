package cn.opt.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;

import cn.opt.mapper.CompetitionMapper;
import cn.opt.mapper.EtimuMapper;
import cn.opt.po.Competition;
import cn.opt.po.Etimu;
import cn.opt.po.EtimuExample;
import cn.opt.po.EtimuExample.Criteria;
import cn.opt.service.EtimuService;
@Service
public class EtimuServiceImpl implements EtimuService {

	@Autowired
	private EtimuMapper etimuMapper;
	@Autowired
	private CompetitionMapper competitionMapper;
	
	@Override
	public List<Etimu> getAllTiMu(Integer id) {
		EtimuExample example = new EtimuExample();
		Criteria criteria = example.createCriteria();
		criteria.andPaIdEqualTo(id);
		List<Etimu> list = etimuMapper.selectByExample(example);
		return list;
	}
	/**
	 * 通过pid和etimuType得到选择题答案
	 */
	public List<Etimu> getOptAnswer(Integer pid, Integer type){
		EtimuExample example = new EtimuExample();
		Criteria criteria = example.createCriteria();
		criteria.andPaIdEqualTo(pid);
		criteria.andEtimuTypeEqualTo(type);
		List<Etimu> list = etimuMapper.selectByExample(example);
		return list;
	}

	@Override
	public PageInfo<Competition> getAllCompeList() {
		List<Competition> list = competitionMapper.selectByExample(null);
		PageInfo<Competition> pageInfoList = new PageInfo<Competition>(list);
		return null;
	}
	@Override
	public List<Etimu> wrongList(Integer brushid) {
		EtimuExample example = new EtimuExample();
		Criteria criteria = example.createCriteria();
		criteria.andBrushIdEqualTo(brushid);
		List<Etimu> list = etimuMapper.selectByExample(example);
		if(list!=null && list.size()>0){
			return list;
		}
		return null;
	}
}
