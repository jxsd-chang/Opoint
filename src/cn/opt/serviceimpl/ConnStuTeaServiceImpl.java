package cn.opt.serviceimpl;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.opt.mapper.ConnStuTeaMapper;
import cn.opt.po.ConnStuTea;
import cn.opt.po.ConnStuTeaExample;
import cn.opt.po.ConnStuTeaExample.Criteria;
import cn.opt.service.ConnStuTeaService;

@Service
public class ConnStuTeaServiceImpl implements ConnStuTeaService {
	
	@Autowired 
	private ConnStuTeaMapper stMapper;

	@Override
	public void addAskMessageByStuTea(ConnStuTea connStuTea) {
		stMapper.insert(connStuTea);
	}

	@Override
	public void replyAskMessage(Integer askid,String solveinfo,String time,Integer states) {
		ConnStuTea ask = stMapper.selectByPrimaryKey(askid);
		ask.setSolveInfo(solveinfo);
		ask.setSolveTime(time);
		ask.setAskState(states);
		stMapper.updateByPrimaryKeySelective(ask);
	}

	@Override
	public List<ConnStuTea> getAttenBtSidAndTid(Integer sid,Integer tid) {
		ConnStuTeaExample connStuTeaExample = new ConnStuTeaExample();
		Criteria createCriteria = connStuTeaExample.createCriteria();
		createCriteria.andStuIdEqualTo(sid);
		createCriteria.andTeaIdEqualTo(tid);
		List<ConnStuTea> list = stMapper.selectByExample(connStuTeaExample);
		if(list!=null && list.size()>0){
			return list;
		}
		return null;
	}
	
	@Override
	public List<ConnStuTea> getAttenBySid(Integer sid,Integer isatten) {
		ConnStuTeaExample connStuTeaExample = new ConnStuTeaExample();
		Criteria createCriteria = connStuTeaExample.createCriteria();
		createCriteria.andStuIdEqualTo(sid);
		createCriteria.andIsattenEqualTo(isatten);
		List<ConnStuTea> list = stMapper.selectByExample(connStuTeaExample);
		//对tid去重
		List<ConnStuTea> listPlus = new ArrayList<ConnStuTea>();
	     Set<Integer> set=new LinkedHashSet<Integer>();
	         for (ConnStuTea conn : list) {
	              if (conn == null) {
	                  continue;
	              }
	              Integer teaid = conn.getTeaId();
	              if (teaid != null) {
	                  if (!set.contains(teaid)) { 
						    set.add(teaid);
						    listPlus.add(conn);
	                  } else {
	                      continue;
	                  }
	              }   
	         }
		if(listPlus!=null && listPlus.size()>0){
			return listPlus;
		}
		return null;
	}

	@Override
	public void updateAskStuTea(ConnStuTea connStuTea) {
		stMapper.updateByPrimaryKey(connStuTea);
	}

	@Override
	public List<ConnStuTea> getTeaReplyMessage(Integer sid, Integer states) {
		ConnStuTeaExample connStuTeaExample = new ConnStuTeaExample();
		Criteria createCriteria = connStuTeaExample.createCriteria();
		createCriteria.andStuIdEqualTo(sid);
		createCriteria.andAskStateEqualTo(states);
		List<ConnStuTea> list = stMapper.selectByExample(connStuTeaExample);
		if(list!=null && list.size()>0){
			return list;
		}
		return null;
	}

	@Override
	public void delAskMessageByaskId(Integer askid) {
		stMapper.deleteByPrimaryKey(askid);
	}

	@Override
	public void quAtten(Integer sid, Integer tid) {
		ConnStuTeaExample example = new ConnStuTeaExample();
		Criteria criteria = example.createCriteria();
		criteria.andStuIdEqualTo(sid);
		criteria.andTeaIdEqualTo(tid);
		criteria.andIsattenEqualTo(1);
		List<ConnStuTea> list = stMapper.selectByExample(example);
		for(ConnStuTea cst:list){
			cst.setIsatten(0);
			stMapper.updateByPrimaryKeySelective(cst);
		}
		
	}

	
}
