package com.game.threading;

public class SynchronizedDemo implements Runnable{
	
	public static void main(String[] args) {
		SynchronizedDemo obj = new SynchronizedDemo();
		
		Thread thread1 = new Thread(obj,"Thread-1");
		Thread thread2 = new Thread(obj,"Thread-2");
		
		thread1.start();
		thread2.start();
	}

	public void run() {
		System.out.println(" Waiting for the lock:"+Thread.currentThread().getName());
		synchronized (this) {

			try {
				System.out.println("Acquired the lock"+Thread.currentThread().getName());
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" has ended.");
		}
		
	}

}
