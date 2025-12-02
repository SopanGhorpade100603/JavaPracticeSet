package com.creationandmethods;

/* how many ways we can create String */
public class Demo01 {
	public static void main(String[] args) {
		
//		using String literals 
		String str = "sopan";
		System.out.println(str);
		
//		using new keyword 
		String s1 = new String("sopan");
		System.out.println(s1);
		
//		using character array
		char [] s2 = {'s','o','p','a','n'};
		System.out.println(s2);
		
//		using stringbuilder
		StringBuilder sb = new StringBuilder("sopan");
		System.out.println(sb);
		
//		using stringbuffer
		StringBuffer sbb = new StringBuffer("sopan");
		System.out.println(sbb);
		
	}

}
