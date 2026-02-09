package com.defaultcomputeifabsent;

import java.util.HashMap;
import java.util.Map;
/*it is default method of map interface present in java.util.package introduced in java8
it will check the key is already present or not if key is not present then it will compute
and insert the value and if key is already present then it will do nothing*/

public class Demo01 {

	public static void main(String[] args) {
		Map<String, Integer> hm = new HashMap<>();
		hm.put("Sopan", 22);
		hm.putIfAbsent("Raj", 23);
		hm.putIfAbsent("Sopan", 28);
		hm.putIfAbsent(null, 23);
		System.out.println(hm);
	}

}
