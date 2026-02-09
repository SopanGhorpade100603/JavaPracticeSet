package com.nt.join;
//join method

class Stuff extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i+" by "+currentThread().getName()+"");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}

public class Demo01 {

	public static void main(String[] args) {
		Stuff t1 = new Stuff();
		Stuff t2 = new Stuff();
		Stuff t3 = new Stuff();

		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t3.start();
	}

}
