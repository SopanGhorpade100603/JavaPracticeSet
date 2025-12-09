package com.method_reference;

import java.util.Arrays;
import java.util.List;
//instance method reference
class Test1{
	public void print(String str) {
		System.out.println(str);
	}
}

public class Demo03 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("sopan","raj","kartik","pawan");
		
		Test1 t = new Test1();
		list.forEach(t::print);
		
	}

}
