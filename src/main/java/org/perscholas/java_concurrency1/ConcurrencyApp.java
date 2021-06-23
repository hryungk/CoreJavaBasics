package org.perscholas.java_concurrency1;

import java.lang.Thread.State;

public class ConcurrencyApp {

	public static void main(String[] args) {
		long id = Thread.currentThread().getId();
		String name = Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority();
		State state = Thread.currentThread().getState();
		String threadGroupName = Thread.currentThread().getThreadGroup().getName();		
		System.out.printf("id=%d; name=%s; priority=%s; state=%s; threadGroupName=%s%n", id, name, priority, state,threadGroupName);
	}

}
