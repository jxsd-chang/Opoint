package cn.opt.mapper;

import cn.opt.po.ConnStuTea;
import cn.opt.po.ConnStuTeaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConnStuTeaMapper {
    int countByExample(ConnStuTeaExample example);

    int deleteByExample(ConnStuTeaExample example);

    int deleteByPrimaryKey(Integer askId);

    int insert(ConnStuTea record);

    int insertSelective(ConnStuTea record);

    List<ConnStuTea> selectByExample(ConnStuTeaExample example);

    ConnStuTea selectByPrimaryKey(Integer askId);

    int updateByExampleSelective(@Param("record") ConnStuTea record, @Param("example") ConnStuTeaExample example);

    int updateByExample(@Param("record") ConnStuTea record, @Param("example") ConnStuTeaExample example);

    int updateByPrimaryKeySelective(ConnStuTea record);

    int updateByPrimaryKey(ConnStuTea record);
}