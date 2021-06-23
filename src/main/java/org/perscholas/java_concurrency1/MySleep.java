package org.perscholas.java_concurrency1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MySleep implements Runnable {

	@Override
	public void run() {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			try {
				System.out.println("Getting ready to sleep.");
				Thread.sleep(3000);
				System.out.println("Done sleeping.");
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("All done with everything");
	}
	
	public static void main(String[] args) throws InterruptedException {
		MySleep app = new MySleep();
		app.run();
		
		for (int i = 0; i < 5; i++) {
			Thread.sleep(1000);
			System.out.println(i);
		}

	}

}
