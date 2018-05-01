package cn.opt.mapper;

import cn.opt.po.Note;
import cn.opt.po.NoteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NoteMapper {
    int countByExample(NoteExample example);

    int deleteByExample(NoteExample example);

    int deleteByPrimaryKey(Integer noteId);

    int insert(Note record);

    int insertSelective(Note record);

    List<Note> selectByExample(NoteExample example);

    Note selectByPrimaryKey(Integer noteId);

    int updateByExampleSelective(@Param("record") Note record, @Param("example") NoteExample example);

    int updateByExample(@Param("record") Note record, @Param("example") NoteExample example);

    int updateByPrimaryKeySelective(Note record);

    int updateByPrimaryKey(Note record);
}