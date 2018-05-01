package cn.opt.mapper;

import cn.opt.po.Exercise;
import cn.opt.po.ExerciseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExerciseMapper {
    int countByExample(ExerciseExample example);

    int deleteByExample(ExerciseExample example);

    int deleteByPrimaryKey(Integer exerId);

    int insert(Exercise record);

    int insertSelective(Exercise record);

    List<Exercise> selectByExample(ExerciseExample example);

    Exercise selectByPrimaryKey(Integer exerId);

    int updateByExampleSelective(@Param("record") Exercise record, @Param("example") ExerciseExample example);

    int updateByExample(@Param("record") Exercise record, @Param("example") ExerciseExample example);

    int updateByPrimaryKeySelective(Exercise record);

    int updateByPrimaryKey(Exercise record);
    
    public List<Exercise> getRandomExercise(Integer i);

    void setFlag(@Param("exid") Integer exid,@Param("uuid") String uuid);
}