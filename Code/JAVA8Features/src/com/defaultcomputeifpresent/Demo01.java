package com.defaultcomputeifpresent;

import java.util.HashMap;
import java.util.Map;

/*it is default method of map interface available in java.util package, introduces in
java8 , it will compute value only when key is already present, if key is not present
then do nothing*/
public class Demo01 {
	public static void main(String[] args) {
		Map<String, Integer> hm = new HashMap<>();
		hm.computeIfPresent("sopan", (key, value) -> value);
		hm.put("raj", 10);
		hm.computeIfPresent("raj", (key, value) -> +value * 2);
		System.out.println(hm);

		Map<Integer, String> hm1 = new HashMap<>();
		hm1.put(12, "Apple");
		hm1.computeIfPresent(12, (k, v) -> k * 10 + "");
		System.out.println(hm1);
	}

}
