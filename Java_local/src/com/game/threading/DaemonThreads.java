/**
 * 
 */
package com.game.threading;

/**
 * @author bittu
 *
 */
public class DaemonThreads {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread thread1 = new Thread("Bittu-Daemon thread"){
			@Override
			public void run() {
				System.out.println("Daemon thread is started :"+Thread.currentThread().getName());
				System.out.println("Daemon thread completed: "+Thread.currentThread().getName());
			}
		};
//		thread1.setDaemon(true);
		System.out.println(Thread.currentThread().getName()+" is Daemon thread: "+thread1.isDaemon());
		System.out.println("Thread priority: "+thread1.getPriority());
		thread1.start();
//		thread1.setDaemon(true);		
	}
	
}
