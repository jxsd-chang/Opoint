package cn.opt.mapper;

import cn.opt.po.Comment;
import cn.opt.po.CommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommentMapper {
    int countByExample(CommentExample example);

    int deleteByExample(CommentExample example);

    int deleteByPrimaryKey(Integer commId);

    int insert(Comment record);

    int insertSelective(Comment record);

    List<Comment> selectByExample(CommentExample example);

    Comment selectByPrimaryKey(Integer commId);

    int updateByExampleSelective(@Param("record") Comment record, @Param("example") CommentExample example);

    int updateByExample(@Param("record") Comment record, @Param("example") CommentExample example);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);
    
    
    /**
   	 * 学生发表评论
   	 */
       public void publishComm(@Param("stuid") Integer stuid,
       		@Param("knifoid") Integer knifoid,
       		@Param("commInfo") String commInfo,
       		@Param("pubTime") String pubTime);
       
   /**
  	 * 老师发表评论
  	 */
      public void publishCommTea(@Param("teaid") Integer teaid,
      		@Param("knifoid") Integer knifoid,
      		@Param("commInfo") String commInfo,
      		@Param("pubTime") String pubTime);
}