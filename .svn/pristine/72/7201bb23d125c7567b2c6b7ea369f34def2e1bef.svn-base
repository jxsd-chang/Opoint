package cn.opt.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.opt.mapper.CompetitionMapper;
import cn.opt.po.Competition;
import cn.opt.service.CompetitionService;
@Service
public class CompetitionServiceImpl implements CompetitionService {

	@Autowired
	public CompetitionMapper competitionMapper;
	
	@Override
	public List<Competition> obtainCompetition(Integer pageNumber,Integer pageSize) throws Exception {
		List<Competition> list=competitionMapper.obtainCompetitionPaging(pageNumber,pageSize);
		return list;
	}

	@Override
	public List<Competition> obtainAllCompetition() {
		List<Competition> list=competitionMapper.selectByExample(null);
		return list;
	}

}
