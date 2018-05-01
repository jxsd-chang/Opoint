package cn.opt.mapper;

import cn.opt.po.Teacher;
import cn.opt.po.TeacherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeacherMapper {
    int countByExample(TeacherExample example);

    int deleteByExample(TeacherExample example);

    int deleteByPrimaryKey(Integer teaId);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    List<Teacher> selectByExample(TeacherExample example);

    Teacher selectByPrimaryKey(Integer teaId);

    int updateByExampleSelective(@Param("record") Teacher record, @Param("example") TeacherExample example);

    int updateByExample(@Param("record") Teacher record, @Param("example") TeacherExample example);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);

    public  List<Teacher> getAllTea(@Param("page") Integer page, @Param("rows") Integer rows);
    
    public Integer getCounts();
    
    public void updatePwd(@Param("teaid") Integer teaid, @Param("pass") String pass);

	List<Teacher> sortTeaByParm(@Param("opt") String opt);
}