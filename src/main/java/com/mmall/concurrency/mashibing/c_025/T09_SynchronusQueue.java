package com.mmall.concurrency.mashibing.c_025;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class T09_SynchronusQueue { //����Ϊ0
	public static void main(String[] args) throws InterruptedException {
		BlockingQueue<String> strs = new SynchronousQueue<>();
		
		new Thread(()->{
			try {
				System.out.println(strs.take());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}).start();
		
		strs.put("aaa"); //�����ȴ�����������
		//strs.add("aaa");
		System.out.println(strs.size());
	}
}
