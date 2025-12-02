package com.creationandmethods;

public class Demo05equals {

	public static void main(String[] args) {
		String str = "sopan";
		String str1 = "Sopan";
		boolean rs = str.equals(str1);
		boolean res = str.equalsIgnoreCase(str1);
		System.out.println(rs);
		System.out.println(res);
		System.out.println();
		
		String s = "java";
		String ss = new String("java");
		System.out.println(s==ss);
		System.out.println(s.equals(ss));
	}

}
