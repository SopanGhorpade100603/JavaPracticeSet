package com.nt.runnable;

public class Demo05UsingLambda {
	public static void main(String[] args) {
		Thread thread = new Thread(()->{
				for (int i = 0; i < 5; i++) {
					System.out.println("hello sopan");
			}
		});
		thread.start();
		
	}

}
