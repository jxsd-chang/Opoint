package cn.opt.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.opt.exception.MessageException;
import cn.opt.mapper.AdminMapper;
import cn.opt.mapper.StudentMapper;
import cn.opt.mapper.TeacherMapper;
import cn.opt.po.Admin;
import cn.opt.po.AdminExample;
import cn.opt.po.Student;
import cn.opt.po.StudentExample;
import cn.opt.po.Teacher;
import cn.opt.po.TeacherExample;
import cn.opt.po.StudentExample.Criteria;
import cn.opt.service.UserService;
import cn.opt.utils.MD5Utils;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private StudentMapper studentMapper;
	@Autowired
	private TeacherMapper teacherMapper;
	@Autowired
	private AdminMapper adminMapper;

	@Override
	/**
	 * 系统角色注册
	 */
	public int register(String jus, String usertele, String password) throws Exception {
		int res = 0;
		if(jus.equals("s")){
			Student student = new Student();
			student.setStuTel(usertele);
			String new_password = MD5Utils.md5(password);
			student.setStuPwd(new_password);
			res = studentMapper.insert(student);
			if(res <= 0){
				throw new MessageException("注册失败");
			}
		}else if(jus.equals("t")){
			Teacher teacher = new Teacher();
			teacher.setTeaTel(usertele);
			String new_password = MD5Utils.md5(password);
			teacher.setTeaPwd(new_password);
			res = teacherMapper.insert(teacher);
			if(res <= 0){
				throw new MessageException("注册失败");
			}
		}
		return res;
	}
	@Override
	public Student s_login(String jus, String usertele, String password) throws Exception {
			Student student  = null;
			StudentExample studentExample = new StudentExample();
			Criteria criteria = studentExample.createCriteria();
			criteria.andStuTelEqualTo(usertele);
			String new_password = MD5Utils.md5(password);
			criteria.andStuPwdEqualTo(new_password);
			List<Student> stulist = studentMapper.selectByExample(studentExample);
			if(stulist!=null && stulist.size() > 0){
				student = stulist.get(0);
			}
			return student;
	}
	/**
	 * 老师登录
	 * @throws Exception 
	 */
	@Override
	public Teacher t_login(String jus, String usertele, String password) throws Exception {
			Teacher teacher = null;
			TeacherExample teacherExample = new TeacherExample();
			cn.opt.po.TeacherExample.Criteria criteria = teacherExample.createCriteria();
			criteria.andTeaTelEqualTo(usertele);
			String new_password = MD5Utils.md5(password);
			criteria.andTeaPwdEqualTo(new_password);
			List<Teacher> tealist = teacherMapper.selectByExample(teacherExample);
			if(tealist!=null && tealist.size() > 0){
				teacher = tealist.get(0);
			}
			return teacher;
	}
	/**
	 * 管理员登录
	 */
   public Admin a_login(String admintel, String adminpwd){
	    Admin admin = null;
	    AdminExample example = new AdminExample();
	    AdminExample.Criteria criteria = example.createCriteria();
	    criteria.andAdmTelEqualTo(admintel);
	    criteria.andAdmPwdEqualTo(adminpwd);
	    List list = adminMapper.selectByExample(example);
	    if (list.size() != 0)
	      admin = (Admin)list.get(0);
	      return admin;
   }

	public Integer isExitTel(String phone) {
		
		Integer flag = Integer.valueOf(0);
		StudentExample example = new StudentExample();
		TeacherExample example2 = new TeacherExample();
		StudentExample.Criteria criteria = example.createCriteria();
		TeacherExample.Criteria criteria2 = example2.createCriteria();
		criteria.andStuTelEqualTo(phone);
		criteria2.andTeaTelEqualTo(phone);
		List<Student> stu_list = this.studentMapper.selectByExample(example);
		List<Teacher> tea_list = this.teacherMapper.selectByExample(example2);
		if ((stu_list.size() == 0) && (tea_list.size() == 0))
			flag = Integer.valueOf(0);

		if ((stu_list.size() == 0) && (tea_list.size() != 0)) {
			//老师
			flag = Integer.valueOf(1);
		}
		if ((stu_list.size() != 0) && (tea_list.size() == 0)) {
			//学生
			flag = Integer.valueOf(2);
		}
		if((stu_list.size() ==1) && (tea_list.size() == 1)){
			flag = Integer.valueOf(3);
		}
		return flag;
	}
	@Override
	public void resetpwd(Integer admid, String password) {
		Admin admin = adminMapper.selectByPrimaryKey(admid);
		admin.setAdmPwd(password);
		adminMapper.updateByPrimaryKey(admin);
	}
	
}
