package cn.opt.serviceimpl;

import java.util.LinkedHashSet;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.opt.mapper.KnowpointMapper;
import cn.opt.po.Knowpoint;
import cn.opt.po.KnowpointExample;
import cn.opt.po.KnowpointExample.Criteria;
import cn.opt.service.KnowPointService;
@Service
public class KnowPointServiceImpl implements KnowPointService {
	
	@Autowired
	private KnowpointMapper knowpointMapper;
	/**
	 * 根据课程id得到该课程所有知识点目录结构
	 */
	public List<Knowpoint> getPointItem(Integer id) {
		KnowpointExample example = new KnowpointExample();
		Criteria criteria = example.createCriteria();
		criteria.andCouIdEqualTo(id);
		List<Knowpoint> kpList = knowpointMapper.selectByExample(example);
		return kpList;
	}
	
	/**
	 * 得到所有该课程的知识点的所有大标题
	 */
	public LinkedHashSet<String> getBigTitleByCid(Integer cid){
		LinkedHashSet<String> setTag = new LinkedHashSet<String>();
		KnowpointExample example = new KnowpointExample();
		Criteria criteria = example.createCriteria();
		criteria.andCouIdEqualTo(cid);
		List<Knowpoint> list = knowpointMapper.selectByExample(example);
		for(Knowpoint kp:list){
			setTag.add(kp.getKpBigtag());
		}
		return setTag;
	}
	/**
	 * 根据tag拿到知识点内容
	 */
	public List<Knowpoint> getContentByTag(String tag){
		KnowpointExample example =new KnowpointExample();
		Criteria criteria = example.createCriteria();
		criteria.andKpBigtagEqualTo(tag);
		List<Knowpoint> conList = knowpointMapper.selectByExample(example);
		return conList;
	}

	@Override
	public List<Knowpoint> mohuSearchKp(String content) {
		KnowpointExample example =new KnowpointExample();
		Criteria criteria = example.createCriteria();
		criteria.andKpContentLike("%"+content+"%");
		List<Knowpoint> mohuSerList = knowpointMapper.selectByExample(example);
		return mohuSerList;
	}

	@Override
	public Knowpoint getKnowPointBykpid(Integer kpid) {
		return knowpointMapper.selectByPrimaryKey(kpid);
	}
}
