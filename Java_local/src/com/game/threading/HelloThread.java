package com.game.threading;

public class HelloThread extends Thread {
	public int count = 0;
	public void run(){
		System.out.println("Hello!! Thread is running");
		System.out.println("count:"+count);
//Illegal monitor exception
//				try {
//			this.wait();
//		} catch (InterruptedException e) {
//			System.out.println(e);
//		}
//		count++;
	}
	public static void main(String[] args) {
		HelloThread thread = new HelloThread();
//		thread.start();
		thread.run();
	}
}
