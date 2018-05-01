package cn.opt.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.opt.mapper.BrushMapper;
import cn.opt.mapper.CollectMapper;
import cn.opt.mapper.KninfoMapper;
import cn.opt.mapper.KnowpointMapper;
import cn.opt.mapper.VideoMapper;
import cn.opt.po.Brush;
import cn.opt.po.Collect;
import cn.opt.po.CollectExample;
import cn.opt.po.Kninfo;
import cn.opt.po.Knowpoint;
import cn.opt.po.Video;
import cn.opt.po.CollectExample.Criteria;
import cn.opt.service.CollectService;
@Service
public class CollectServiceImpl implements CollectService{

	@Autowired
	private CollectMapper collectMapper;
	@Autowired
	private VideoMapper videoMapper;
	@Autowired
	private KninfoMapper kninfoMapper;
	@Autowired
	private BrushMapper brushMapper;
	
	public List<Collect> setOption(Integer stuid,Integer flag){
		CollectExample example = new CollectExample();
		Criteria criteria = example.createCriteria();
		criteria.andStuIdEqualTo(stuid);
		criteria.andFlagEqualTo(flag);
		List<Collect> list = collectMapper.selectByExample(example);
		return list;
	}
	
	@Override
	public void scVideo(Integer stuid, Integer vid) {
		Collect coll = new Collect();
		coll.setStuId(stuid);coll.setVioId(vid);coll.setFlag(1);
		collectMapper.insertSelective(coll);
	}

	@Override
	public void qxVideo(Integer vid){
		CollectExample example = new CollectExample();
		Criteria criteria = example.createCriteria();
		criteria.andVioIdEqualTo(vid);
		collectMapper.deleteByExample(example);
	}
	
	@Override
	public Boolean scKnowPoint(Integer stuid, Integer kninfoid) {
		if(! isExitscKnowPoint(stuid, kninfoid)){
			Collect coll = new Collect();
			coll.setStuId(stuid);coll.setKninfoId(kninfoid);coll.setFlag(2);
			collectMapper.insertSelective(coll);
			return true;
		}
		return false;
	}

	
	@Override
	public void qxKnowPoint(Integer kninfoid){
		CollectExample example = new CollectExample();
		Criteria criteria = example.createCriteria();
		criteria.andKninfoIdEqualTo(kninfoid);
		collectMapper.deleteByExample(example);
	}
	@Override
	public Boolean isExitscKnowPoint(Integer stuid,Integer kninfoid){
		CollectExample example = new CollectExample();
		Criteria criteria = example.createCriteria();
		criteria.andStuIdEqualTo(stuid);
		criteria.andFlagEqualTo(2);
		criteria.andKninfoIdEqualTo(kninfoid);
		List<Collect> list = collectMapper.selectByExample(example);
		if(list.size() > 0){
			return true;
		}
		return false;
	}
	
	@Override
	public Boolean scBrushTitle(Integer stuid, Integer brushid) {
		System.out.println(isExitscBrushTitle(stuid, brushid));
		if(! isExitscBrushTitle(stuid, brushid)){
			Collect coll = new Collect();
			coll.setStuId(stuid);coll.setBrushId(brushid);coll.setFlag(3);
			collectMapper.insertSelective(coll);
			return true;
		}
		return false;
	}

	@Override
	public void qxBrushTitle(Integer brushid){
		CollectExample example = new CollectExample();
		Criteria criteria = example.createCriteria();
		criteria.andBrushIdEqualTo(brushid);
		collectMapper.deleteByExample(example);
	}
	
	public Boolean isExitscBrushTitle(Integer stuid,Integer brushid){
		CollectExample example = new CollectExample();
		Criteria criteria = example.createCriteria();
		criteria.andStuIdEqualTo(stuid);
		criteria.andFlagEqualTo(3);
		criteria.andBrushIdEqualTo(brushid);
		List<Collect> list = collectMapper.selectByExample(example);
		System.out.println(list.size());
		if(list.size() > 0){
			return true;
		}
		return false;
	}
	//视屏
	@Override
	public List<Video> getVideoList(Integer stuid, Integer flag) {
		List<Video> videoList = new ArrayList<Video>();
		List<Collect> coll_List = setOption(stuid, flag);
		for(Collect coll:coll_List){
			Video video = videoMapper.selectByPrimaryKey(coll.getVioId());
			videoList.add(video);
		}
		return videoList;
	}

	//知识点
	@Override
	public List<Kninfo> getKnowPointList(Integer stuid, Integer flag) {
		List<Kninfo> knowPointList = new ArrayList<Kninfo>();
		List<Collect> coll_List = setOption(stuid, flag);
		for(Collect coll:coll_List){
			Kninfo kninfo = kninfoMapper.selectByPrimaryKey(coll.getKninfoId());
			knowPointList.add(kninfo);
		}
		return knowPointList;
	}
	//刷题
	@Override
	public List<Brush> getBrushList(Integer stuid, Integer flag) {
		List<Brush> brushList = new ArrayList<Brush>();
		List<Collect> coll_List = setOption(stuid, flag);
		for(Collect coll:coll_List){
			Brush brush = brushMapper.selectByPrimaryKey(coll.getBrushId());
			brushList.add(brush);
		}
		return brushList;
	}
	
}
