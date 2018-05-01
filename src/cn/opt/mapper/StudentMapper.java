package cn.opt.mapper;

import cn.opt.po.Student;
import cn.opt.po.StudentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentMapper {
    int countByExample(StudentExample example);

    int deleteByExample(StudentExample example);

    int deleteByPrimaryKey(Integer stuId);

    int insert(Student record);

    int insertSelective(Student record);

    List<Student> selectByExample(StudentExample example);

    Student selectByPrimaryKey(Integer stuId);

    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByExample(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
    
    public  List<Student> getAllStu1(@Param("page") Integer page, @Param("rows") Integer rows);

    public Integer getCounts();

    public void updatePwd(@Param("stuid") Integer stuid, @Param("pass") String pass);
}