package cn.opt.mapper;

import cn.opt.po.Exam;
import cn.opt.po.ExamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExamMapper {
    int countByExample(ExamExample example);

    int deleteByExample(ExamExample example);

    int deleteByPrimaryKey(String exId);

    int insert(Exam record);

    int insertSelective(Exam record);

    List<Exam> selectByExample(ExamExample example);

    Exam selectByPrimaryKey(String exId);

    int updateByExampleSelective(@Param("record") Exam record, @Param("example") ExamExample example);

    int updateByExample(@Param("record") Exam record, @Param("example") ExamExample example);

    int updateByPrimaryKeySelective(Exam record);

    int updateByPrimaryKey(Exam record);
    
  /*  List<Exam> selectByExamByLimit(@Param("tid") Integer tid,@Param("currPage") Integer currPage,@Param("pageSize") Integer pageSize);*/
}