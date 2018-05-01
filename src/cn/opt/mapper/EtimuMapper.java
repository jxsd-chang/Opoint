package cn.opt.mapper;

import cn.opt.po.Etimu;
import cn.opt.po.EtimuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EtimuMapper {
    int countByExample(EtimuExample example);

    int deleteByExample(EtimuExample example);

    int deleteByPrimaryKey(Integer etimuId);

    int insert(Etimu record);

    int insertSelective(Etimu record);

    List<Etimu> selectByExample(EtimuExample example);

    Etimu selectByPrimaryKey(Integer etimuId);

    int updateByExampleSelective(@Param("record") Etimu record, @Param("example") EtimuExample example);

    int updateByExample(@Param("record") Etimu record, @Param("example") EtimuExample example);

    int updateByPrimaryKeySelective(Etimu record);

    int updateByPrimaryKey(Etimu record);
}