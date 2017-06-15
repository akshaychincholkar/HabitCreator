/**
 * 
 */
package com.game.threading;

/**
 * @author bittu
 *
 */
class VolatileCacheClass implements Runnable{
	volatile int x,y;
	@Override
	public void run() {
		System.out.println("inside run() of thread: "+Thread.currentThread().getName());
		incrementX();
		System.out.println("X value: "+x+" "+Thread.currentThread().getName());
//		incrementY();
//		System.out.println("Y value: "+y);
	}
	private void incrementX(){
		System.out.println("Initial value:"+x);
		if(Thread.currentThread().getName().equals("Thread-0")){
			System.out.println("Thread-0 in incrementX()");
			++x;
			System.out.println("updated: "+x);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(Thread.currentThread().getName().equals("Thread-0")){
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		x++;
	}
	private void incrementY(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		y++;
	}
}
public class VolatileCacheDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		VolatileCacheClass runnable = new VolatileCacheClass();
		
//		Thread thread1 = new Thread(runnable);
//		Thread thread2 = new Thread(runnable);
		
		Thread thread1 = new Thread(new VolatileCacheClass());
		Thread thread2 = new Thread(new VolatileCacheClass());
		
		
		thread1.start();
		thread2.start();
	}

}
