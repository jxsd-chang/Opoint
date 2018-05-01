package cn.opt.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.opt.mapper.RankMapper;
import cn.opt.po.Rank;
import cn.opt.service.RankService;

@Service
public class RankServiceImpl implements RankService {

	@Autowired
	private RankMapper rankMapper;
	
	@Override
	public void addRank(Rank rank) {
		rankMapper.insert(rank);
	}

	@Override
	public List<Rank> getAllRank() {
		List<Rank> list = rankMapper.selectByExample(null);
		if(list!=null && list.size()>0){
			return list;
		}
		return null;
	}

	@Override
	public List<Integer> getEasyWrongBrushs() {
		List<Integer> list = rankMapper.getEasyWrongBrushs();
		if(list !=null && list.size()>0){
			return list;
		}
		return null;
	}
}
