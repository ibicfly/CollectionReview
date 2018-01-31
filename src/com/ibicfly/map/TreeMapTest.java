package com.ibicfly.map;

import java.util.TreeMap;

public class TreeMapTest {
	public static void main(String[] args) {
		TreeMap map=new TreeMap<>();
		for(int i=0;i<10;i++)
		{
			map.put(i, i);
//			map.put(2, new Object());
		}
		for(int i=0;i<map.size();i++)
		{
			System.out.println(map.get(i));
		}
		System.out.println(map.get(2));
		
	}
}
