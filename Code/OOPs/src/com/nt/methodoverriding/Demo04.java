package com.nt.methodoverriding;

class RBI {
	String ifscCode = "so12";

	void loan() {
		System.out.println("rbi provide loan at 10%ROI");
	}
}

class HDFC extends RBI {
	String ifscCode = "gh86";

	@Override
	void loan() {
		System.out.println("HDBC provide loan at 12 % ROI");
	}
}

public class Demo04 {

	public static void main(String[] args) {
		RBI bank = new RBI();
		System.out.println(bank.ifscCode);
		bank.loan();
	}

}
