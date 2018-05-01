package cn.opt.mapper;

import cn.opt.po.Competition;
import cn.opt.po.CompetitionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompetitionMapper {
    int countByExample(CompetitionExample example);

    int deleteByExample(CompetitionExample example);

    int deleteByPrimaryKey(Integer compId);

    int insert(Competition record);

    int insertSelective(Competition record);

    List<Competition> selectByExample(CompetitionExample example);

    Competition selectByPrimaryKey(Integer compId);

    int updateByExampleSelective(@Param("record") Competition record, @Param("example") CompetitionExample example);

    int updateByExample(@Param("record") Competition record, @Param("example") CompetitionExample example);

    int updateByPrimaryKeySelective(Competition record);

    int updateByPrimaryKey(Competition record);
    
    List<Competition> obtainCompetitionPaging(@Param("number")Integer pageNumber,@Param("size")Integer pageSize);
    
}