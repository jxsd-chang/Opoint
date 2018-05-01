package cn.opt.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.opt.mapper.ClagradeMapper;
import cn.opt.mapper.ConnStuClaMapper;
import cn.opt.po.Clagrade;
import cn.opt.po.ClagradeExample;
import cn.opt.po.ClagradeExample.Criteria;
import cn.opt.po.ConnStuClaExample;
import cn.opt.po.ConnStuClaKey;
import cn.opt.service.ClagradeService;
@Service
public class ClagradeServiceImpl implements ClagradeService {

	@Autowired
	private ClagradeMapper clagradeMapper;
	@Autowired
	private ConnStuClaMapper scMapper;
	
	
	@Override
	public List<Clagrade> getClagradeList(Integer teaid) {
		ClagradeExample clagradeExample = new ClagradeExample();
		Criteria createCriteria = clagradeExample.createCriteria();
		createCriteria.andTeaIdEqualTo(teaid);
		List<Clagrade> list = clagradeMapper.selectByExample(clagradeExample);
		if(list !=null && list.size()>0){
			return list;
		}
		return null;
	}

	@Override
	public void createNewCla(Integer teaid, Integer claNo,String claName, Integer claCapacity, String claIntro) {
		Clagrade clagrade = new Clagrade();
		clagrade.setTeaId(teaid);
		clagrade.setClaNo(claNo);
		clagrade.setClaName(claName);
		clagrade.setClaCapacity(claCapacity);
		clagrade.setClaIntro(claIntro);
		clagradeMapper.insertSelective(clagrade);
	}

	@Override
	public boolean deleCla(Integer claid) {
		if(clagradeMapper.deleteByPrimaryKey(claid)>0){
			return true;
		}
		return false;
	}

	@Override
	public void updateCla(Integer claid, Clagrade clagrade) {
		Clagrade cla = clagradeMapper.selectByPrimaryKey(claid);
		cla.setClaNo(clagrade.getClaNo());
		cla.setClaName(clagrade.getClaName());
		cla.setClaCapacity(clagrade.getClaCapacity());
		cla.setClaIntro(clagrade.getClaIntro());
		clagradeMapper.updateByPrimaryKeySelective(cla);
	}

	@Override
	public Clagrade getClaByclaid(Integer claid) {
		return 	clagradeMapper.selectByPrimaryKey(claid);
	}

	@Override
	public void joinCla(Integer sid, Integer claid) {
		ConnStuClaKey claKey = new ConnStuClaKey();
		claKey.setClaId(claid);
		claKey.setStuId(sid);
		scMapper.insert(claKey);
	}

	@Override
	public boolean isExitStuFromCla(Integer sid, Integer claid) {
		ConnStuClaExample example = new ConnStuClaExample();
		cn.opt.po.ConnStuClaExample.Criteria criteria = example.createCriteria();
		criteria.andClaIdEqualTo(claid);
		criteria.andStuIdEqualTo(sid);
		List<ConnStuClaKey> list = scMapper.selectByExample(example);
		if(list !=null && list.size()>0){
			return true;
		}
		return false;
	}

	@Override
	public List<Integer> getAllStuByClaid(Integer claid) {
		List<Integer>  stuIdList = new ArrayList<Integer>();
		ConnStuClaExample example = new ConnStuClaExample();
		cn.opt.po.ConnStuClaExample.Criteria criteria = example.createCriteria();
		criteria.andClaIdEqualTo(claid);
		List<ConnStuClaKey> list = scMapper.selectByExample(example);
		for(ConnStuClaKey con:list){
			stuIdList.add(con.getStuId());
		}
		if(stuIdList!=null && stuIdList.size()>0){
			return stuIdList;
		}
		return null;
	}

	@Override
	public int getClaCounts(Integer stuid) {
		ConnStuClaExample example = new ConnStuClaExample();
		cn.opt.po.ConnStuClaExample.Criteria criteria = example.createCriteria();
		criteria.andStuIdEqualTo(stuid);
		List<ConnStuClaKey> list = scMapper.selectByExample(example);
		if(list !=null && list.size()>0){
			return list.size();
		}
		return 0;
	}

}
