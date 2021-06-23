package org.perscholas.java_concurrency2;

public class MultithreadingExercise {

	public static void main(String[] args) throws InterruptedException {
//		/* Problem 1. */
//		Thread thread1 = new MyThread1("Thread1");
//		Thread thread2 = new MyThread1("Thread2");
//		thread1.start();		
//		thread2.start();

		/* Problem 2. */
		MyThread2[] threads = new MyThread2[3];
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new MyThread2(Integer.toString(i));
		}
		for (int i = 0; i < threads.length; i++) {			
			threads[i].start();
			if (i == 0)
				threads[i].join();
		}

//		/* Problem 3. */
//		MyThread3[] threads = new MyThread3[3];
//		
//		threads[0] = new MyThread3("My First Thread");
//		threads[1] = new MyThread3("My Second Thread");
//		threads[2] = new MyThread3("My Third Thread");
//		
//		for (int i = 0; i < threads.length; i++) {
//			threads[i].start();
//			if (i == 0)
//				threads[i].join();
//		}

//		/* Problem 4. */
//		Thread[] threads = new Thread[3];
//		threads[0] = new MyThread4("Thhread-0", Thread.MIN_PRIORITY);
//		threads[1] = new MyThread4("Thhread-1", Thread.MAX_PRIORITY);
//		threads[2] = new MyThread4("Thhread-2", Thread.NORM_PRIORITY);
//		for (int i = 0; i < threads.length; i++) {
//			threads[i].start();
//		}

	}

	/**
	 * Problem 1. Write a Java program that starts two threads and each thread will
	 * print the numbers from 1 - 4. While performing this task each thread will be
	 * at sleep for two seconds.
	 * 
	 * @author HRK
	 *
	 */
	private static class MyThread1 extends Thread {

		public MyThread1(String str) {
			super(str);
		}

		@Override
		public void run() {
			try {
				for (int i = 0; i < 4; i++) {
					System.out.println(i + 1);
					Thread.sleep(2000);
				}

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	/**
	 * Problem 2. Write a Java program that starts three threads and each will take
	 * 1 second to print out each number from 1 - 5. However, the second and third
	 * thread must wait until the first thread finishes. Use sleep and join.
	 * 
	 * @author HRK
	 *
	 */
	private static class MyThread2 extends Thread {

		public MyThread2(String str) {
			super(str);
		}

		@Override
		public void run() {
			System.out.println(Thread.currentThread());
			try {
				for (int i = 0; i < 5; i++) {
					Thread.sleep(1000);
					System.out.println(i + 1);					
				}

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	/**
	 * Problem 3. Repeat the work done in question 2, however, this time give name
	 * to each thread.
	 * 
	 * @author HRK
	 *
	 */
	private static class MyThread3 extends Thread {

		public MyThread3(String str) {
			super(str);
		}

		@Override
		public void run() {
			System.out.println(Thread.currentThread());
			try {
				for (int i = 0; i < 5; i++) {
					Thread.sleep(1000);
					System.out.println(i + 1);
				}

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	/**
	 * Problem 4. Write a program that assigns priority to three threads
	 * (MIN_PRIORITY, NORM_PRIORITY, MAX_PRIORITY) and starts all thread. Each will
	 * take 2 seconds to print out the thread name, it’s priority and a line
	 * separator. This task will happen 3 times.
	 * 
	 * @author HRK
	 *
	 */
	private static class MyThread4 extends Thread {

		public MyThread4(String str, int priority) {
			super(str);
			setPriority(priority);
		}

		@Override
		public void run() {
			try {				
				for (int i = 0; i < 3; i++) {
					System.out.println("running thread name is:" + getName());
					System.out.println("running thread priority is:" + getPriority());
					System.out.println("=======================================");
					Thread.sleep(2000);
				}

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}	
}
