package com.app.a;

import java.util.ArrayList;
import java.util.List;

public class SampleOne {
	
	public static void main(String[] args) {
		List<Integer> l1 =new ArrayList<Integer>();
		l1.add(1);
		l1.add(2);
		
		List<Integer> l2 =new ArrayList<Integer>();
		l2.add(3);
		l2.add(4);
		
		List<List<Integer>> li = new ArrayList<List<Integer>>();
		li.add(l1);
		li.add(l2);
		System.out.println(li.get(1).get(1));
		
		
	}

}
