package cn.opt.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class RankIdUtils {
	
	public static List<Integer> getSortRank(List<Integer> list){
		Set<Integer> set = new HashSet<Integer>(list); 
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		List<Integer> sortList = new ArrayList<Integer>();
        for (Integer temp : set) {  
            map.put(temp, Collections.frequency(list, temp));
        }
        List<Map.Entry<Integer, Integer>> infoIds = new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet());  
        Collections.sort(infoIds, new Comparator<Map.Entry<Integer, Integer>>() {  
            public int compare(Map.Entry<Integer, Integer> o1,  
                    Map.Entry<Integer, Integer> o2) {  
                return (o2.getValue()).toString().compareTo(o1.getValue().toString());  
            }  
        }); 
        for (int i = 0; i < infoIds.size(); i++) { 
            sortList.add(infoIds.get(i).getKey());
        }
        return sortList;
	}
}
