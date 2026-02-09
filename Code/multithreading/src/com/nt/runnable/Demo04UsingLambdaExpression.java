package com.nt.runnable;

public class Demo04UsingLambdaExpression {

	public static void main(String[] args) {
		Runnable r=()->{
			for (int i = 0; i < 5; i++) {
				System.out.println("hello sopan");
			}
		};
		Thread thread = new Thread(r);
		thread.start();

	}

}
