package cn.opt.serviceimpl;

import cn.opt.mapper.ExamMapper;
import cn.opt.po.Exam;
import cn.opt.po.ExamExample;
import cn.opt.po.Student;
import cn.opt.po.ExamExample.Criteria;
import cn.opt.service.ExamService;
import cn.opt.vo.ExamVo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;

@Service
public class ExamServiceImpl implements ExamService {

	@Autowired
	private ExamMapper examMapper;

	public void addRecord(Exam ex) {
		this.examMapper.insert(ex);
	}

	@Override
	public Exam getExamByExid(String exid) {
		return examMapper.selectByPrimaryKey(exid);
	}

	@Override
	public void updateState(String exid) {
		Exam exam = examMapper.selectByPrimaryKey(exid);
		exam.setExState(1);
		examMapper.updateByPrimaryKeySelective(exam);
	}

	@Override
	public void updateExam(String exid, Exam exam) {
		Exam exam2 = examMapper.selectByPrimaryKey(exid);
		exam2.setTeaId(exam.getTeaId());
		exam2.setExDatiAns(exam.getExDatiAns());
		exam2.setExOptAns(exam.getExOptAns());
		exam2.setExGrade(exam.getExGrade());
		exam2.setExState(exam.getExState());
		examMapper.updateByPrimaryKeySelective(exam2);
	}


	public List<ExamVo> getExamsByTid(Integer tid) {
		ExamExample example = new ExamExample();
		Criteria criteria = example.createCriteria();
		criteria.andTeaIdEqualTo(tid);
		List<Exam> list = examMapper.selectByExample(example);
		List<ExamVo> examVoList = new ArrayList<ExamVo>();
		for(Exam exam:list){
			ExamVo examVo = new ExamVo();
			examVo.setExam(exam);
			examVoList.add(examVo);
		}
		if(examVoList !=null && examVoList.size()>0){
			return examVoList;
		}
		return null;
	}
	
	@Override
	public int getexamCounts() {
		List<Exam> list = examMapper.selectByExample(null);
		if(list!=null && list.size()>0){
			return list.size();
		}
		return 0;
	}

	@Override
	public Integer examCountsBysid(Integer sid) {
		ExamExample examExample = new ExamExample();
		Criteria criteria = examExample.createCriteria();
		criteria.andStuIdEqualTo(sid);
		List<Exam> list = examMapper.selectByExample(examExample);
		if(list!=null && list.size()>0){
			return list.size();
		}
		return 0;
	}

	@Override
	public Integer paperCountsBysidAndpid(Integer sid, Integer pid) {
		ExamExample examExample = new ExamExample();
		Criteria criteria = examExample.createCriteria();
		criteria.andStuIdEqualTo(sid);
		criteria.andPaIdEqualTo(pid);
		List<Exam> list = examMapper.selectByExample(examExample);
		if(list!=null && list.size()>0){
			return list.size();
		}
		return 0;
	}

	@Override
	public List<Exam> getExamListBysid(Integer sid) {
		ExamExample examExample = new ExamExample();
		Criteria criteria = examExample.createCriteria();
		criteria.andStuIdEqualTo(sid);
		List<Exam> list = examMapper.selectByExample(examExample);
		if(list!=null && list.size()>0){
			return list;
		}
		return null;
	}
	
	@Override
	public List<Exam> getExamListBysidAndpid(Integer sid,Integer pid) {
		ExamExample examExample = new ExamExample();
		Criteria criteria = examExample.createCriteria();
		criteria.andStuIdEqualTo(sid);
		criteria.andPaIdEqualTo(pid);
		List<Exam> list = examMapper.selectByExample(examExample);
		if(list!=null && list.size()>0){
			return list;
		}
		return null;
	}
}