package cn.opt.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.opt.mapper.ClagradeMapper;
import cn.opt.mapper.ConnStuClaMapper;
import cn.opt.mapper.PublishMapper;
import cn.opt.mapper.TeacherMapper;
import cn.opt.po.ConnStuClaExample;
import cn.opt.po.ConnStuClaExample.Criteria;
import cn.opt.po.ConnStuClaKey;
import cn.opt.po.Publish;
import cn.opt.po.PublishExample;
import cn.opt.service.PublishService;
import cn.opt.vo.PublishVo;
@Service
public class PublishServiceImpl implements PublishService {
	
	@Autowired
	private PublishMapper publishMapper;
	@Autowired 
	private ConnStuClaMapper scMapper;
	@Autowired 
	private ClagradeMapper clagradeMapper;
	@Autowired 
	private TeacherMapper teacherMapper;
	
	@Override
	public void pubTaskToCla(String publishid,Integer teaid, Integer claid, String pubTitle, String pubInfo, String pubPic,String pubTime,String endTime) {
		Publish publish=new Publish();
		publish.setPublishId(publishid);
		publish.setTeaId(teaid);
		publish.setClaId(claid);
		publish.setWorkTitle(pubTitle);
		publish.setWorkInfo(pubInfo);
		publish.setWorkPic(pubPic);
		publish.setPublishTime(pubTime);
		publish.setPublishEndtime(endTime);
		publishMapper.insert(publish);
	}

	@Override
	public List<PublishVo> getHomeWorkList(Integer sid) {
		List<PublishVo> allPublishList = new ArrayList<PublishVo>();
		ConnStuClaExample example = new ConnStuClaExample();
		Criteria criteria = example.createCriteria();
		criteria.andStuIdEqualTo(sid);
		List<ConnStuClaKey> list = scMapper.selectByExample(example);
		if(list !=null && list.size()>0){
			for(ConnStuClaKey conn:list){
				Integer claId = conn.getClaId();
				PublishExample publishExample = new PublishExample();
				cn.opt.po.PublishExample.Criteria createCriteria = publishExample.createCriteria();
				createCriteria.andClaIdEqualTo(claId);
				List<Publish> pubList = publishMapper.selectByExample(publishExample);
				for(Publish pub:pubList){
					PublishVo publishVo = new PublishVo();
					publishVo.setPublish(pub);
					publishVo.setClaName(clagradeMapper.selectByPrimaryKey(pub.getClaId()).getClaName());
					publishVo.setTeaName(teacherMapper.selectByPrimaryKey(pub.getTeaId()).getTeaName());
					allPublishList.add(publishVo);
				}
			}
			return allPublishList;
		}
		return null;
	}


	@Override
	public List<Publish> getAllPubByClaid(Integer claid) {
		PublishExample example = new PublishExample();
		cn.opt.po.PublishExample.Criteria criteria = example.createCriteria();
		criteria.andClaIdEqualTo(claid);
		List<Publish> list = publishMapper.selectByExample(example);
		if(list!= null && list.size()>0){
			return list;
		}
		return null;
	}

	@Override
	public Publish getPublishBypubid(String publishid) {
		return  publishMapper.selectByPrimaryKey(publishid);
	}

}
