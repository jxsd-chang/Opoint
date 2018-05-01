package cn.opt.service;

import java.util.List;

import cn.opt.po.Exercise;

public interface ExerciseService {
	//随机获取count条记录 
	public List<Exercise> getRandomExercise(Integer count);
}
