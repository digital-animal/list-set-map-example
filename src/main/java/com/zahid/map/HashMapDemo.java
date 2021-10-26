package com.zahid.map;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, Integer> dict = new HashMap<String, Integer>();
		dict.put("a", 4);
		dict.put("b", 9);
		dict.put("c", 2);
		
		System.out.println(dict);
		System.out.println(dict.get("a"));
		System.out.println(dict.get("b"));
		System.out.println(dict.get("c"));
		
		HashMap<String, String> fun = new HashMap<String, String>();
		fun.put("alex", "test123");
		fun.put("lee", "test@123");
		fun.put("cooper", "p@ssword123");
		fun.put("david", "1234");
		
		System.out.println(fun);
		System.out.println(fun.get("alex"));
		
		fun.remove("lee");
		System.out.println(fun);
		System.out.println(fun.containsKey("david"));
		System.out.println(fun.containsKey("john"));
		
		System.out.println(fun.containsValue("test@123"));
		System.out.println(fun.containsValue("test1234"));
		
		System.out.println(fun.size());
		
		fun.replace("david", "testing3210");
		System.out.println(fun);
		
		System.out.println(fun.keySet());
		System.out.println(fun.values());
	}

}
