package cn.opt.serviceimpl;

import cn.opt.mapper.ConnStuTeaMapper;
import cn.opt.mapper.TeacherMapper;
import cn.opt.po.ConnStuTea;
import cn.opt.po.ConnStuTeaExample;
import cn.opt.po.ConnStuTeaExample.Criteria;
import cn.opt.po.Teacher;
import cn.opt.po.TeacherExample;
import cn.opt.service.TeacherService;
import cn.opt.utils.MD5Utils;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService {

	@Autowired
	private TeacherMapper teacherMapper;
	@Autowired
	private ConnStuTeaMapper stuTeaMapper;

	@Override
	public List<Teacher> getAllTea(Integer page, Integer rows) {
		return teacherMapper.getAllTea(page, rows);
	}
	
	public Integer getCounts() {
		return this.teacherMapper.getCounts();
	}
	public Teacher findTeaById(Integer id) {
		Teacher teacher = this.teacherMapper.selectByPrimaryKey(id);
		return teacher;
	}

	public void deleteTeaById(int id) {
		this.teacherMapper.deleteByPrimaryKey(Integer.valueOf(id));
	}

	public void updateTea(Teacher tea) {
		this.teacherMapper.updateByPrimaryKey(tea);
	}

	public void updatePwd(Integer teaid, String pass) throws Exception {
		this.teacherMapper.updatePwd(teaid, MD5Utils.md5(pass));
	}

	public Teacher findTeaByTel(String tel) {
		TeacherExample example = new TeacherExample();
		TeacherExample.Criteria criteria = example.createCriteria();
		criteria.andTeaTelEqualTo(tel);
		List list = this.teacherMapper.selectByExample(example);
		if (list.size() == 0)
			return null;

		return ((Teacher) list.get(0));
	}

	@Override
	public List<Teacher> getAllTeacher() {
		return teacherMapper.selectByExample(null);
	}

	@Override
	public List<Teacher> sortTeaByParm(String opt) {
		String select = "";
		if(opt.equals("1")){
			select = "tea_qucount";
		}else if(opt.equals("2")){
			select = "tea_atten";
		}else{
			
		}
		return teacherMapper.sortTeaByParm(select);
	}

	@Override
	public List<ConnStuTea> getAllAskFromStu(Integer teaid) {
		ConnStuTeaExample example = new ConnStuTeaExample();
		Criteria criteria = example.createCriteria();
		criteria.andTeaIdEqualTo(teaid);
		List<ConnStuTea> list = stuTeaMapper.selectByExample(example);
		if(list!=null && list.size()>0){
			return list;
		}
		return null;
	}
}