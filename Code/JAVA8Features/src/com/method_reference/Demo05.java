package com.method_reference;

import java.util.Arrays;
import java.util.List;

//constructor reference
class Test3 {
	public Test3(String str) {
		System.out.println(str);
	}
}

public class Demo05 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("sopan", "raj", "kartik", "pawan");

		list.forEach(Test3::new);

	}

}
