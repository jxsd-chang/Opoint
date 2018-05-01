package cn.opt.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.opt.mapper.KninfoMapper;
import cn.opt.po.Kninfo;
import cn.opt.po.KninfoExample;
import cn.opt.po.KninfoExample.Criteria;
import cn.opt.service.KninfoService;
@Service
public class KninfoServiceImpl implements KninfoService {
	@Autowired
	private KninfoMapper kninfoMapper;
	
	@Override
	public List<Kninfo> getKninfoByKpId(Integer kpId) {
		KninfoExample example = new KninfoExample();
		Criteria criteria = example.createCriteria();
		criteria.andKpIdEqualTo(kpId);
		List<Kninfo> info_list = kninfoMapper.selectByExample(example);
		return info_list;
	}

	@Override
	public Kninfo getKninfoByKninfoId(Integer kninfoid) {
		return kninfoMapper.selectByPrimaryKey(kninfoid);
	}

}
