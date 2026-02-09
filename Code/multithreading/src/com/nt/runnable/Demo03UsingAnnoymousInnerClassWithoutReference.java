package com.nt.runnable;

public class Demo03UsingAnnoymousInnerClassWithoutReference {
	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("hello sopan");
				}
			}
		});
		thread.start();
	}
}
