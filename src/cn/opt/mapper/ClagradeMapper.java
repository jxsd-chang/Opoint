package cn.opt.mapper;

import cn.opt.po.Clagrade;
import cn.opt.po.ClagradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClagradeMapper {
    int countByExample(ClagradeExample example);

    int deleteByExample(ClagradeExample example);

    int deleteByPrimaryKey(Integer claId);

    int insert(Clagrade record);

    int insertSelective(Clagrade record);

    List<Clagrade> selectByExample(ClagradeExample example);

    Clagrade selectByPrimaryKey(Integer claId);

    int updateByExampleSelective(@Param("record") Clagrade record, @Param("example") ClagradeExample example);

    int updateByExample(@Param("record") Clagrade record, @Param("example") ClagradeExample example);

    int updateByPrimaryKeySelective(Clagrade record);

    int updateByPrimaryKey(Clagrade record);
}