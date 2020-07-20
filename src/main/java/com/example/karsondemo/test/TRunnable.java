package com.example.karsondemo.test;
public class TRunnable {

	public static void main(String[] args) {
		Thread t = new Thread("aaaa") {
			public void run() {
				for (int i = 0; i < Integer.MAX_VALUE; i++) {
					System.out.println(this.getState().toString()+i);
				}
			}
		};
		t.start();
	}

}
