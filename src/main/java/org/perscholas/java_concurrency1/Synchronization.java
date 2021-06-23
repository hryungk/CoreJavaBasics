package org.perscholas.java_concurrency1;

public class Synchronization implements Runnable {

	private static int counter = 0;

	@Override
//	public synchronized void run() {
	public void run() {
		while (counter < 10) {
			synchronized (Synchronization.class) {
				System.out.println("[" + Thread.currentThread().getName() + "] before: " + counter);
				counter++;
				System.out.println("[" + Thread.currentThread().getName() + "] after: " + counter);
			}
		}
		counter = 0;
//		System.out.println("other threads");
	}

	public static void main(String[] args) throws InterruptedException {
		Thread[] threads = new Thread[5];
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(new Synchronization(), "thread-" + i);
			threads[i].start();
//			threads[i].join(); // does a similar thing to synchronized block
		}
	}

}
