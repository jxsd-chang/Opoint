package cn.opt.service;

import cn.opt.exception.MessageException;
import cn.opt.po.Admin;
import cn.opt.po.Student;
import cn.opt.po.Teacher;


public interface UserService {
	/**
	 * 学生登录业务
	 */
	public Student s_login(String jus,String usertele,String password) throws Exception;
	
	/**
	 * 老师登录业务
	 */
	public Teacher t_login(String jus,String usertele,String password) throws Exception;
	/**
	 * 管理员登录
	 */
	public Admin a_login(String admintel, String adminpwd);
	/**
	 * 管理员重置密码
	 */
	public void resetpwd(Integer admid,String password);
	/**
	 * 注册业务
	 * @throws MessageException 
	 */
	public int register(String jus,String usertele,String password) throws Exception;
	
	public  Integer isExitTel(String phone);
	
}
