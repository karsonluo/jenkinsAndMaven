package com.example.karsondemo.test;
public class TTimeWaiting {

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
							obj.wait(3000);
						} catch (InterruptedException e) {
						}
						System.out.println("i= " +i++);
					}
				}
			}
		};

		Thread t2 = new Thread() {
			@Override
			public void run() {
				int j = 0;
				while (true) {
					synchronized (obj) {
//						for (int i = 0; i < Integer.MAX_VALUE; i++) {
//							System.out.println(i);
//						}
						try {
							sleep(4000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println("j= " + j++);
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
