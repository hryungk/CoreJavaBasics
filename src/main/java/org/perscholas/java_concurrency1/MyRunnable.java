package org.perscholas.java_concurrency1;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Executing thread " + Thread.currentThread().getName());

	}

	public static void main(String[] args) throws InterruptedException {
		Thread myThread = new Thread(new MyRunnable(), "myRunnable");
		myThread.start();
	}

}
