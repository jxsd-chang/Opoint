package cn.opt.mapper;

import cn.opt.po.Kninfo;
import cn.opt.po.KninfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KninfoMapper {
    int countByExample(KninfoExample example);

    int deleteByExample(KninfoExample example);

    int deleteByPrimaryKey(Integer kninfoId);

    int insert(Kninfo record);

    int insertSelective(Kninfo record);

    List<Kninfo> selectByExample(KninfoExample example);

    Kninfo selectByPrimaryKey(Integer kninfoId);

    int updateByExampleSelective(@Param("record") Kninfo record, @Param("example") KninfoExample example);

    int updateByExample(@Param("record") Kninfo record, @Param("example") KninfoExample example);

    int updateByPrimaryKeySelective(Kninfo record);

    int updateByPrimaryKey(Kninfo record);
}