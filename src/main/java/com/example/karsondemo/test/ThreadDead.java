package com.example.karsondemo.test;
public class ThreadDead implements Runnable {
	public int flag = 1;
	static Object o1 = new Object();
	static Object o2 = new Object();

	public static void main(String[] args) {
		ThreadDead td1 = new ThreadDead();
		ThreadDead td2 = new ThreadDead();
		td1.flag = 1;
		td2.flag = 0;
		Thread t1 = new Thread(td1);
		Thread t2 = new Thread(td2);
		t1.start();
		t2.start();
	}

	public void run() {
		if (flag == 1) {
			synchronized (o1) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
				}
				synchronized (o2) {
					System.out.println("1");
				}
			}
		}
		if (flag == 0) {
			synchronized (o2) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
				}
				synchronized (o1) {
					System.out.println("0");
				}
			}
		}
	}
}
