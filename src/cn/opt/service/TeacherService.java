package cn.opt.service;

import java.util.List;

import cn.opt.po.ConnStuTea;
import cn.opt.po.Teacher;

public interface TeacherService {
	/**
	 * 查询所有老师
	 */
	public List<Teacher> getAllTea(Integer page, Integer rows);
	/**
	 *得到 所有老师
	 */
	public List<Teacher> getAllTeacher();
	
	/**
	 * 总记录数
	 */
	public Integer getCounts();
	/**
	 * 根据id查询老师
	 */
	public Teacher findTeaById(Integer id);
	
	public Teacher findTeaByTel(String tel);
	
	/**
	 * 根据id删除一个老师
	 */
	public void deleteTeaById(int id);
	
	/**
	 * 更新老师
	 */
	public void updateTea(Teacher tea);
	/**
	 * 密码更新
	 */
	public void updatePwd(Integer teaid, String pass) throws Exception;
	public List<Teacher> sortTeaByParm(String opt);
	/**
	 * 得到接受的所有提问
	 */
	public List<ConnStuTea> getAllAskFromStu(Integer teaid);
}
