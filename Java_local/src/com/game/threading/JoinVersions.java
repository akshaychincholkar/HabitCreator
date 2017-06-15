/**
 * 
 */
package com.game.threading;

/**
 * @author bittu
 *
 */
class JoinVersionsClass implements Runnable{

	@Override
	public void run() {
		System.out.println("inside run()");
		for(int i=1 ; i<= 10; i++){
			System.out.println("Iteration: "+i+" thread: "+Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
public class JoinVersions {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		JoinVersionsClass runnable = new JoinVersionsClass();
		
		System.out.println("inside main()");
		Thread thread1 = new Thread(runnable);
		Thread thread2 = new Thread(runnable);
		
		thread1.start();
		thread1.join(2000);
		
		thread2.start();
		thread2.join(1000);
		System.out.println("end of main()");
	}

}
