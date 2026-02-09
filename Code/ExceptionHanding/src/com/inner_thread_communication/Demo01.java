package com.inner_thread_communication;
//Print odd and even numbers up to 20 using two threads.
public class Demo01 {
	
	synchronized void printOdd() {
		for(int i=1;i<=20;i++) {
			if(i%2!=0) {
				System.out.println("Odd: "+i);
				notify();
			}else {
				try {
					wait();
				}catch(InterruptedException e) {}
			}
		}
	}
	synchronized void printEven() {
		for(int i=1;i<=20;i++) {
			if(i%2==0) {
				System.out.println("Even: "+i);
				notify();
			}else {
				try {
					wait();
				} catch (InterruptedException e) {}
			}
		}
		
	}

	public static void main(String[] args) {
		Demo01 d= new Demo01();
		Thread t1 = new Thread(()->d.printEven());
		Thread t2 = new Thread(()->d.printOdd());
		t1.start(); 
		t2.start();

	}

}
