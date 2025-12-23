package com.practice;

	/*Input : 00000123569
	  Output : 123569*/
public class RemoveLeadingZeros {

	public static void main(String[] args) {
		String str = "00000123569";
		String res = str.replaceFirst("^0+", "");
//		System.out.println(res);
		
//		another approach
		String result = String.valueOf(Integer.parseInt(str));
//		System.out.println(result);
		
		
		
		
	}

}
