/**
 * 
 */
package com.game.threading;

/**
 * @author bittu
 *
 */
class JoinClass implements Runnable{

	@Override
	public void run() {
		System.out.println("inside the run()");
		for(int i = 0; i<5 ; i++){
			System.out.println("Looping iteration: "+i+" for thread: "+Thread.currentThread().getName());
		}
	}
	
}
public class JoinDemo {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("start of main()");
		JoinClass runnable = new JoinClass();
		Thread thread1 = new Thread(runnable);
		Thread thread2 = new Thread(runnable);
		
		thread1.start();
		thread1.join(0);
		thread2.start();
		thread2.join(0);
		System.out.println("end of main()");
	}

}
