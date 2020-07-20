package com.example.karsondemo.test;
/**
 * 
 * �̵߳ĺϲ��ĺ�����ǽ����������̵߳��̺߳ϲ�Ϊһ�����߳�ִ��
 * Ӧ�ó����ǵ�һ���̱߳���ȴ���һ���߳�ִ����ϲ���ִ��ʱ��Thread���ṩ��join����������������
 * 
 */
public class TJoin {
	public static void main(String[] args) throws InterruptedException {
		MyThread T1 = new MyThread();
		T1.setName("T1");
		T1.start();
		T1.join(1);// T1��ɺ�Ŵ�ӡSystem.out.println(Thread.currentThread().getName()
					// + "�̵߳�" + i+ "��ִ�У�");
		// T1.join(1)//
		// �����̼߳��뵽���̺߳��棬����������߳���1msʱ����ûִ���꣬�����̱߳㲻�ٵȴ���ִ���꣬�������״̬���ȴ�cpu����
		for (int i = 0; i < 10; i++) {
			// �ȴ�T1ִ����ɺ�Ŵ�ӡ��������
			System.out.println(Thread.currentThread().getName() + "�̵߳�" + i
					+ "��ִ�У�");
		}
	}
}

class MyThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(this.getName() + "�̵߳�" + i + "��ִ�У�");
		}
	}
}
