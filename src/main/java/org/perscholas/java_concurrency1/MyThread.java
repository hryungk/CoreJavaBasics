package org.perscholas.java_concurrency1;

public class MyThread extends Thread {

	public MyThread(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		System.out.println("Executing thread " + Thread.currentThread().getName());		
	}
	
	public static void main (String[] args) throws InterruptedException {
		MyThread myThread = new MyThread("myThread");
		myThread.start();
		
		MyThread myThread2 = new MyThread("myThread2");
		myThread2.start();		
		
	}
}
