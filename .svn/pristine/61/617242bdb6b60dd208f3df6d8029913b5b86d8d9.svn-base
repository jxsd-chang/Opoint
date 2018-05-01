package cn.opt.mapper;

import cn.opt.po.Paper;
import cn.opt.po.PaperExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaperMapper {
    int countByExample(PaperExample example);

    int deleteByExample(PaperExample example);

    int deleteByPrimaryKey(Integer paId);

    int insert(Paper record);

    int insertSelective(Paper record);

    List<Paper> selectByExample(PaperExample example);

    Paper selectByPrimaryKey(Integer paId);

    int updateByExampleSelective(@Param("record") Paper record, @Param("example") PaperExample example);

    int updateByExample(@Param("record") Paper record, @Param("example") PaperExample example);

    int updateByPrimaryKeySelective(Paper record);

    int updateByPrimaryKey(Paper record);
}