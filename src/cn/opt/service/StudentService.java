package cn.opt.service;

import java.util.List;

import com.github.pagehelper.PageInfo;

import cn.opt.po.Student;

public interface StudentService {
	/**
	 * 查询所有学生
	 */
	public PageInfo<Student> getAllStu(Integer currentPage, Integer pageSize);
	/**
	 * easyui
	 */
	public List<Student> getAllStu1(Integer page, Integer rows);
	/**
	 * 总记录数
	 */
	public Integer getCounts();
	/**
	 * 根据id查询学生
	 */
	public Student findStuById(Integer id);
	/**
	 * 根据姓名查询学生
	 */
	public List<Student> findStuByName(String name);
	public Student findStuByTel(String tel);
	
	/**
	 * 根据id删除一个学生
	 */
	public void deleteStuById(Integer id);
	
	/**
	 * 更新学生
	 */
	public void updateStu(Integer stuid,Student stu);
	
	/**
	 * 忘记密码
	 */
	public void updatePwd(Integer stuid, String pass) throws Exception;
	

	
}
