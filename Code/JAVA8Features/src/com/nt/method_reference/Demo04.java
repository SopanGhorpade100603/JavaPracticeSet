package com.nt.method_reference;

import java.util.Arrays;
import java.util.List;
//static method reference
class Test2{
	public static  void print(String str) {
		System.out.println(str);
	}
}

public class Demo04 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("sopan","raj","kartik","pawan");
		
		list.forEach(Test2::print);
		
	}

}
