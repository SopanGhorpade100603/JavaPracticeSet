package com.map.identityhashmap;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class DemoD02 {

	public static void main(String[] args) {
		IdentityHashMap<String, String> map = new IdentityHashMap<>();
		 String str = new String("sopan");
		 String str2 = new String("sopan");
		 
		 map.put(str, "Hyd");
		 map.put(str2, "Sambhajinagar");
		 System.out.println(map);
		 
	}

}
