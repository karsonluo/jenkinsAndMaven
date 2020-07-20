package com.example.karsondemo.test;


public class TBlocked {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Object lock = new Object();
		Runnable run = new Runnable() {
			public void run() {
				for (int i = 0; i < Integer.MAX_VALUE; i++) {
					synchronized (lock) {
						System.out.println(i);
					}
				}
			}
		};

		Thread t1 = new Thread(run);
		t1.setName("T1111");
		Thread t2 = new Thread(run);
		t2.setName("T2222");
		t2.start();
		t1.start();
	}
}
