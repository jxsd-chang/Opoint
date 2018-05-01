package cn.opt.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.opt.mapper.ExerciseMapper;
import cn.opt.po.Exercise;
import cn.opt.po.ExerciseExample;
import cn.opt.po.ExerciseExample.Criteria;
import cn.opt.service.ExerciseService;
import cn.opt.utils.CommonUtils;
@Service
public class ExerciseServiceImpl implements ExerciseService{

	@Autowired
	private ExerciseMapper exerciseMapper;
	
	@Override
	public List<Exercise> getRandomExercise(Integer count) {
		List<Exercise> ran_list = exerciseMapper.getRandomExercise(count);
		List<Exercise> randomList = new ArrayList<Exercise>();
		String uuid = CommonUtils.getUUID();
		for(Exercise ex:ran_list){
			exerciseMapper.setFlag(ex.getExerId(), uuid);
			Exercise exercise = exerciseMapper.selectByPrimaryKey(ex.getExerId());
			randomList.add(exercise);
		}
		return randomList;
	}
}
