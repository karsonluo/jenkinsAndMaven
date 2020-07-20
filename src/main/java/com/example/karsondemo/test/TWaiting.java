package com.example.karsondemo.test;
public class TWaiting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		final Object obj = new Object();
		Thread t1 = new Thread() {
			@Override
			public void run() {
				int i = 0;
				while (true) {
					synchronized (obj) {
						try {
							obj.wait();
						} catch (InterruptedException e) {
						}
						System.out.println(i++);
					}
				}
			}
		};

		Thread t2 = new Thread() {
			@Override
			public void run() {
				while (true) {
					synchronized (obj) {
						for (int i = 0; i < Integer.MAX_VALUE; i++) {
							System.out.println(i);
						}
						obj.notifyAll();
					}
				}
			}
		};

		t1.setName("T1");
		t2.setName("T2");
		t1.start();
		t2.start();


	}

}
