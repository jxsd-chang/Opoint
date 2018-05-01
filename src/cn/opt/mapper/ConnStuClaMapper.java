package cn.opt.mapper;

import cn.opt.po.ConnStuClaExample;
import cn.opt.po.ConnStuClaKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConnStuClaMapper {
    int countByExample(ConnStuClaExample example);

    int deleteByExample(ConnStuClaExample example);

    int deleteByPrimaryKey(ConnStuClaKey key);

    int insert(ConnStuClaKey record);

    int insertSelective(ConnStuClaKey record);

    List<ConnStuClaKey> selectByExample(ConnStuClaExample example);

    int updateByExampleSelective(@Param("record") ConnStuClaKey record, @Param("example") ConnStuClaExample example);

    int updateByExample(@Param("record") ConnStuClaKey record, @Param("example") ConnStuClaExample example);
}