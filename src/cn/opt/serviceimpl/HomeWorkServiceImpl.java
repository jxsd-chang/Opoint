package cn.opt.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.opt.mapper.ClagradeMapper;
import cn.opt.mapper.HomeworkMapper;
import cn.opt.mapper.PublishMapper;
import cn.opt.mapper.TeacherMapper;
import cn.opt.po.Homework;
import cn.opt.po.HomeworkExample;
import cn.opt.po.HomeworkExample.Criteria;
import cn.opt.vo.HomeworkVo;

@Service
public class HomeWorkServiceImpl implements cn.opt.service.HomeWorkService {

	@Autowired
	private HomeworkMapper homeworkMapper;
	@Autowired
	private PublishMapper publishMapper;
	@Autowired
	private ClagradeMapper clagradeMapper;
	@Autowired
	private TeacherMapper teacherMapper;
	
	@Override
	public void submitClaWork(Homework homework) {
		homeworkMapper.insert(homework);
	}

	@Override
	public List<Homework> alreaySubWork(Integer claid,String publishid) {
		HomeworkExample example = new HomeworkExample();
		Criteria criteria = example.createCriteria();
		criteria.andReplyworkClaidEqualTo(claid);
		criteria.andPublishIdEqualTo(publishid);
		List<Homework> list = homeworkMapper.selectByExample(example);
		if(list!=null && list.size()>0){
			return list;
		}
		return null;
	}

	@Override
	public void solveWorkBypublishidAndStuid(String replyworkId, Homework homework) {
		Homework work = homeworkMapper.selectByPrimaryKey(replyworkId);
		work.setSolveworkInfo(homework.getSolveworkInfo());
		work.setSolveworkTime(homework.getSolveworkTime());
		work.setSolveworkState(homework.getSolveworkState());
		work.setSolveworkPic(homework.getSolveworkPic());
		homeworkMapper.updateByPrimaryKeySelective(work);
	}

	@Override
	public Homework getHomeworkByrepId(String replyworkId) {
		return homeworkMapper.selectByPrimaryKey(replyworkId);
	}

	@Override
	public List<HomeworkVo> getAllHomeWorksByStuid(Integer stuid) {
		List<HomeworkVo> homeworkVos = new ArrayList<HomeworkVo>();
		HomeworkExample example = new HomeworkExample();
		Criteria criteria = example.createCriteria();
		criteria.andReplyworkStuidEqualTo(stuid);
		List<Homework> works = homeworkMapper.selectByExample(example);
		for(Homework work:works){
			HomeworkVo homeworkVo = new HomeworkVo();
			homeworkVo.setHomework(work);
			homeworkVo.setPublish(publishMapper.selectByPrimaryKey(work.getPublishId()));
			homeworkVo.setClaName(clagradeMapper.selectByPrimaryKey(work.getReplyworkClaid()).getClaName());
			homeworkVo.setTeaName(teacherMapper.selectByPrimaryKey(work.getReplyworkTeaid()).getTeaName());
			homeworkVos.add(homeworkVo);
		}
		if(homeworkVos !=null && homeworkVos.size()>0){
			return homeworkVos;
		}
		return null;
	}

	@Override
	public HomeworkVo getHomeWorksByReplyWorkId(String replyworkid) {
		HomeworkVo homeworkVo = new HomeworkVo();
		Homework homework = homeworkMapper.selectByPrimaryKey(replyworkid);
		homeworkVo.setHomework(homework);
		homeworkVo.setPublish(publishMapper.selectByPrimaryKey(homework.getPublishId()));
		return homeworkVo;
	}
}
