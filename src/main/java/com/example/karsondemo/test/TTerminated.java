package com.example.karsondemo.test;
public class TTerminated {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread();
		t1.start();
		System.out.println(t1.getState());
		try {
			Thread.sleep(1000L);
		} catch (InterruptedException e) {
		}
		System.out.println(t1.getState());
	}

}
