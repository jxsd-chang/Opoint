package cn.opt.mapper;

import cn.opt.po.Homework;
import cn.opt.po.HomeworkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HomeworkMapper {
    int countByExample(HomeworkExample example);

    int deleteByExample(HomeworkExample example);

    int deleteByPrimaryKey(String replyworkId);

    int insert(Homework record);

    int insertSelective(Homework record);

    List<Homework> selectByExample(HomeworkExample example);

    Homework selectByPrimaryKey(String replyworkId);

    int updateByExampleSelective(@Param("record") Homework record, @Param("example") HomeworkExample example);

    int updateByExample(@Param("record") Homework record, @Param("example") HomeworkExample example);

    int updateByPrimaryKeySelective(Homework record);

    int updateByPrimaryKey(Homework record);
}