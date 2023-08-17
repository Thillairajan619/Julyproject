package com.app.a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SampleTwo {

	public static void main(String[] args) {
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		map1.put("username", 9);
		map1.put("firstname", 7);
		Map<String, Integer> map2 = new HashMap<String, Integer>();
		map2.put("Lastname", 8);
		map2.put("email", 6);
		
		List<Map<String, Integer>> li = new ArrayList<Map<String,Integer>>();
		li.add(map1);
		li.add(map2);
		System.out.println(li.get(0).get("username"));
		
		
	}
}
