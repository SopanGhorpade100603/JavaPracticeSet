package com.nt.sleep;
//sleep method
public class Demo01 {
	public static void main(String[] args) {
		Thread t = new Thread();
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
