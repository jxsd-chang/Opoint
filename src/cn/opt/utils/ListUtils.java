package cn.opt.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import cn.opt.vo.AnyVo;

public class ListUtils {
	public static List<AnyVo> getRepeat(List<AnyVo> list){
	      List<AnyVo> list1= new ArrayList<AnyVo>();
	      Set<String> set=new HashSet<String>();
          for (AnyVo an : list) {
	          String  title = an.getTitle();
	          if (title != null && !title.equals("经典例题")) {
	              if (!set.contains(title)) {
					  	set.add(title);
					  	list1.add(an);
	              } else {
		               continue;
	              }
		      }   
          }
          return list1;
	}
}
