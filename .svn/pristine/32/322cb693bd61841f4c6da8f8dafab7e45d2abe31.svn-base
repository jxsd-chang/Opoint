package cn.opt.mapper;

import cn.opt.po.Publish;
import cn.opt.po.PublishExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PublishMapper {
    int countByExample(PublishExample example);

    int deleteByExample(PublishExample example);

    int deleteByPrimaryKey(String publishId);

    int insert(Publish record);

    int insertSelective(Publish record);

    List<Publish> selectByExample(PublishExample example);

    Publish selectByPrimaryKey(String publishId);

    int updateByExampleSelective(@Param("record") Publish record, @Param("example") PublishExample example);

    int updateByExample(@Param("record") Publish record, @Param("example") PublishExample example);

    int updateByPrimaryKeySelective(Publish record);

    int updateByPrimaryKey(Publish record);
}