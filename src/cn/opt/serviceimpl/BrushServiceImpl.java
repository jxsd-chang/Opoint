package cn.opt.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.opt.mapper.BrushMapper;
import cn.opt.po.Brush;
import cn.opt.po.BrushExample;
import cn.opt.po.BrushExample.Criteria;
import cn.opt.service.BrushService;
@Service
public class BrushServiceImpl implements BrushService {

	@Autowired
	private BrushMapper brushMapper;

	@Override
	public List<Brush> getBrushByKpId(Integer kpid){
		BrushExample brushExample = new BrushExample();
		Criteria createCriteria = brushExample.createCriteria();
		createCriteria.andKpIdEqualTo(kpid);
		List<Brush> list = brushMapper.selectByExample(brushExample);
		return list;
	}
	
	/**
	 * 根据刷题id得到题目
	 */
	public Brush getTitleByBrushId(Integer id){
		Brush brush = brushMapper.selectByPrimaryKey(id);
		return brush;
	}

	@Override
	public Brush getBrushBybrushId(Integer id) {
		return brushMapper.selectByPrimaryKey(id);
	}

}
