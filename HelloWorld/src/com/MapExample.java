package com;

import java.util.*;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map = new HashMap();
		// Adding elements to map
		map.put(1, "abc");
		map.put(5, "hgd");
		map.put(2, "kjghdd");
		map.put(9, "iouyit");
		Set set = map.entrySet();
		map.remove(5);
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			Map.Entry entry = (Map.Entry) itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
