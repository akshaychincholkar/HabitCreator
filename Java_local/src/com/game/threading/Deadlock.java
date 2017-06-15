/**
 * 
 */
package com.game.threading;

/**
 * @author bittu
 *
 */
class StringClassThread implements Runnable{

	@Override
	public void run() {
		synchronized (String.class) {
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Before deadlock of String");
			synchronized (Object.class) {
				System.out.println("Inside synchronized block of Object");
			}
			System.out.println("After deadlock of String");
		}
	}

}
class ObjectClassThread implements Runnable{

	@Override
	public void run() {
		synchronized (Object.class) {
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Before deadlock of Object");
			synchronized (String.class) {
				System.out.println("Inside synchronized of String");
			}
			System.out.println("After deadlock of Object");
		}
	}
	
}
public class Deadlock {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		StringClassThread runnable1 = new StringClassThread();
		ObjectClassThread runnable2	= new ObjectClassThread();
		
		Thread thread1 = new Thread(runnable1);
		Thread thread2 = new Thread(runnable2);
		
		thread1.start();
		thread2.start();
	}

}
