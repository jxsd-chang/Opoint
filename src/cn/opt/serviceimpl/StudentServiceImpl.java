package cn.opt.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.opt.mapper.StudentMapper;
import cn.opt.po.Student;
import cn.opt.po.StudentExample;
import cn.opt.po.StudentExample.Criteria;
import cn.opt.service.StudentService;
import cn.opt.utils.MD5Utils;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentMapper studentMapper;

	@Override
	public PageInfo<Student> getAllStu(Integer currentPage, Integer pageSize) {
		StudentExample example = new StudentExample();
		PageHelper.startPage(currentPage, pageSize);
		List<Student> list = studentMapper.selectByExample(example);
		PageInfo<Student> pageInfo = new PageInfo<Student>(list);
		return pageInfo;
	}

	public List<Student> getAllStu1(Integer page, Integer rows) {
		List stuList = this.studentMapper.getAllStu1(page, rows);
		return stuList;
	}

	public Integer getCounts() {
		return this.studentMapper.getCounts();
	}

	public void updatePwd(Integer stuid, String pass) throws Exception {
		this.studentMapper.updatePwd(stuid, MD5Utils.md5(pass));
	}

	public Student findStuByTel(String tel) {
		StudentExample example = new StudentExample();
		StudentExample.Criteria criteria = example.createCriteria();
		criteria.andStuTelEqualTo(tel);
		List list = this.studentMapper.selectByExample(example);
		if (list.size() == 0)
			return null;
		return ((Student) list.get(0));
	}

	@Override
	public void deleteStuById(Integer id) {
		studentMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void updateStu(Integer stuid,Student stu) {
		Student student = studentMapper.selectByPrimaryKey(stuid);
		student.setStuName(stu.getStuName());
		student.setStuGrade(stu.getStuGrade());
		student.setStuPro(stu.getStuPro());
		student.setStuTel(stu.getStuTel());
		student.setStuSex(stu.getStuSex());
		student.setStuJifen(stu.getStuJifen());
		student.setStuPic(stu.getStuPic());
		student.setStuQuecount(stu.getStuQuecount());
		studentMapper.updateByPrimaryKeySelective(student);
	}

	@Override
	public Student findStuById(Integer id) {
		Student student = studentMapper.selectByPrimaryKey(id);
		return student;
	}

	@Override
	public List<Student> findStuByName(String name) {
		StudentExample example = new StudentExample();
		Criteria criteria = example.createCriteria();
		criteria.andStuNameEqualTo(name);
		List<Student> list = studentMapper.selectByExample(example);
		return list;
	}


}
