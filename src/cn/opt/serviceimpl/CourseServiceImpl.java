package cn.opt.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.opt.mapper.CourseMapper;
import cn.opt.po.Course;
import cn.opt.po.CourseExample;
import cn.opt.service.CourseService;
@Service
public class CourseServiceImpl implements CourseService {
	@Autowired
	private CourseMapper courseMapper;
	
	public Course getCourseById(Integer id){
		return courseMapper.selectByPrimaryKey(id);
	}
	
	public List<Course> findAllCou() {
		CourseExample example = new CourseExample();
		List<Course> list = courseMapper.selectByExample(example);
		return list;
	}
}
