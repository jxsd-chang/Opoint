package cn.opt.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.opt.mapper.CommentMapper;
import cn.opt.po.Comment;
import cn.opt.po.CommentExample;
import cn.opt.po.CommentExample.Criteria;
import cn.opt.service.CommentService;
@Service
public class CommentServiceImpl implements CommentService{
	
	@Autowired
	private CommentMapper commentMapper;
	
	@Override
	public List<Comment> getAllComm(Integer knifoid) {
		CommentExample commentExample = new CommentExample();
		Criteria criteria = commentExample.createCriteria();
		criteria.andKninfoIdEqualTo(knifoid);
		return  commentMapper.selectByExample(commentExample);
	}

	@Override
	public void publishComm(Integer stuid, Integer knifoid, String commInfo, String pubTime) {
		commentMapper.publishComm(stuid, knifoid, commInfo, pubTime);
	}

	@Override
	public void publishCommTea(Integer teaid, Integer knifoid, String commInfo, String pubTime) {
		commentMapper.publishCommTea(teaid, knifoid, commInfo, pubTime);
	}

}
