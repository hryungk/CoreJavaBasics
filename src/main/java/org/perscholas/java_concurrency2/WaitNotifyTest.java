package org.perscholas.java_concurrency2;

/**
 * Problem 6.
 * 
 * @author HRK
 *
 */
public class WaitNotifyTest {

	public static void main(String[] args) {
		Message msg = new Message("process it");
		Waiter waiter1 = new Waiter(msg);
		Thread thread1 = new Thread(waiter1, "waiter1");
		thread1.start();
		
		Waiter waiter2 = new Waiter(msg);
		Thread thread2 = new Thread(waiter2, "waiter2");
		thread2.start();
		
		Notifier notifier = new Notifier(msg);
		Thread thread3 = new Thread(notifier, "notifier");
		thread3.start();
		
		System.out.println("All threads are started");

	}
	
	/**
	 * Processes on Message object and invoke notify method to wake up threads waiting for Message object.
	 * @author HRK
	 *
	 */
	private static class Notifier implements Runnable {
		private Message msg;
		
		public Notifier(Message message) {
			msg = message;
		}
		
		@Override
		public void run() {
			String name = Thread.currentThread().getName();
			System.out.printf("[%s] started%n", name);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized(msg) {
				msg.setMessage(String.format("[%s] Notifier work done", name));
//				msg.notify();
				msg.notifyAll();
			}
			
		}
	}

	private static class Waiter implements Runnable {
		private Message msg;
		
		public Waiter(Message message) {
			msg = message;
		}
		
		@Override
		public void run() {
			String name = Thread.currentThread().getName();
			synchronized(msg) {
				System.out.printf("[%s] waiting to get notified at time: [%d]%n",name,System.currentTimeMillis());
				try {
					msg.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.printf("[%s] waiter thread got notified at time: [%d]%n",name,System.currentTimeMillis());
				System.out.printf("[%s] processed: %s%n",name,msg.getMessage());
			}
		}
	}
	
	/**
	 * Create a bean class called Message on which threads will work and call wait,
	 * notify and notifyAll methods. This class contains a private string property
	 * fields called message. Provide a constructor that takes one parameter to
	 * initialize the member field message. Also provide getter and setters to the
	 * private message field.
	 * 
	 * @author HRK
	 *
	 */
	private static class Message {
		private String message;

		public Message(String msg) {
			message = msg;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

	}

}
