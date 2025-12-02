package com.creationandmethods;

public class Demo09split {
	public static void main(String[] args) {
		String str = "Chhatrapati Sambhajinagar";
		String[] split = str.split("a");
		for(String st : split){
			System.out.println(st);
		}
	}

}
