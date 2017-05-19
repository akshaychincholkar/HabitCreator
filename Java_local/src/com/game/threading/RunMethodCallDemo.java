package com.game.threading;
class RunMethodDemo implements Runnable{
	public void run() {
		System.out.println("Running thread: "+Thread.currentThread().getName());	
	}
}
public class RunMethodCallDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Main thread:"+Thread.currentThread().getName());
		Thread thread1 = new Thread(new RunMethodDemo(),"Thread-1");
		thread1.start();
//		thread1.run();
	}

}
