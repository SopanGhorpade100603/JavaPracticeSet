package com.nt.enum_;

public class Demo02 {
	
	enum WeekDay{
		SUNDAY,MONDAY,TUESDAY,WEDNSDAY,THRUSDAY,FRIDAY,SATURDAY;
		private WeekDay() {
			System.out.println("constructor are always private or default and every time its execute");
			
		}
	}

	public static void main(String[] args) {
		System.out.println(WeekDay.MONDAY.ordinal());
	}

}
