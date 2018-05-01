package cn.opt.mapper;

import cn.opt.po.Knowpoint;
import cn.opt.po.KnowpointExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KnowpointMapper {
    int countByExample(KnowpointExample example);

    int deleteByExample(KnowpointExample example);

    int deleteByPrimaryKey(Integer kpId);

    int insert(Knowpoint record);

    int insertSelective(Knowpoint record);

    List<Knowpoint> selectByExample(KnowpointExample example);

    Knowpoint selectByPrimaryKey(Integer kpId);

    int updateByExampleSelective(@Param("record") Knowpoint record, @Param("example") KnowpointExample example);

    int updateByExample(@Param("record") Knowpoint record, @Param("example") KnowpointExample example);

    int updateByPrimaryKeySelective(Knowpoint record);

    int updateByPrimaryKey(Knowpoint record);
}