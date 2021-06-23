package org.perscholas.java_concurrency2;

/**
 * Problem 5.
 * Imagine a couple, Ranjeet and Reema, who both have access to the
 * account and want to make withdrawals. But they don't want the account to
 * ever be overdrawn. Create a class AccountTesting that will start two threads
 * and both thread trying to withdraw money from same account object in the
 * loop. Withdrawal is two steps process : 1. Check the balance. 2. If
 * there&#39;s enough in the account (withdraw 10), make the withdrawal. Wait
 * 100 before withdraw
 * 
 * @author HRK
 *
 */
public class AccountTesting {

	public static void main(String[] args) {
		Account account = new Account();
		
		Thread th1 = new MyThread5("Ranjeet", account);
		Thread th2 = new MyThread5("Reema", account);
		
		th1.start();
		th2.start();

	}

	private static class MyThread5 extends Thread {

		private Account account;

		public MyThread5(String str, Account account) {
			super(str);
			this.account = account;
		}

		@Override
		public void run() {
			try {
				for (int i = 0; i < 5; i++) {
					Thread.sleep(100);
					synchronized(account) {
						if (account.isBalanceEnough(10)) {
//							Thread.sleep(100);
							System.out.println(getName() + " is going to withdraw");						
							account.withdraw(10);
							System.out.println(getName() + " completes the withdraw");
						} else {
							System.out.println(
									"Not enough in account for " + getName() + " to withdraw " + account.getBalance());
						}
					}
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	/**
	 * Problem 5. Create a class called Account that represents a bank account. This
	 * account starts with a balance of $50 and can be used only for withdrawals.
	 * The withdrawal will be accepted even if there isn't enough money in the
	 * account to cover it. The account simply reduces the balance by the amount you
	 * want to withdraw.
	 * 
	 * @author HRK
	 *
	 */
	private static class Account {
		private double balance;

		public Account() {
			balance = 50.0;
		}

		public synchronized void withdraw(double amount) {
			balance -= amount;
		}

		public boolean isBalanceEnough(double amount) {
			return balance >= 0 && balance >= amount;
		}

		public double getBalance() {
			return balance;
		}
	}
}