package cn.opt.mapper;

import cn.opt.po.Collect;
import cn.opt.po.CollectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CollectMapper {
    int countByExample(CollectExample example);

    int deleteByExample(CollectExample example);

    int deleteByPrimaryKey(Integer colId);

    int insert(Collect record);

    int insertSelective(Collect record);

    List<Collect> selectByExample(CollectExample example);

    Collect selectByPrimaryKey(Integer colId);

    int updateByExampleSelective(@Param("record") Collect record, @Param("example") CollectExample example);

    int updateByExample(@Param("record") Collect record, @Param("example") CollectExample example);

    int updateByPrimaryKeySelective(Collect record);

    int updateByPrimaryKey(Collect record);
}