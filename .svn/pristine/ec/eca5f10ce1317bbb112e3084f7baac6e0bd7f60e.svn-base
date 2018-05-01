package cn.opt.mapper;

import cn.opt.po.Brush;
import cn.opt.po.BrushExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BrushMapper {
    int countByExample(BrushExample example);

    int deleteByExample(BrushExample example);

    int deleteByPrimaryKey(Integer brushId);

    int insert(Brush record);

    int insertSelective(Brush record);

    List<Brush> selectByExample(BrushExample example);

    Brush selectByPrimaryKey(Integer brushId);

    int updateByExampleSelective(@Param("record") Brush record, @Param("example") BrushExample example);

    int updateByExample(@Param("record") Brush record, @Param("example") BrushExample example);

    int updateByPrimaryKeySelective(Brush record);

    int updateByPrimaryKey(Brush record);
}