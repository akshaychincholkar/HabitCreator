package com.game.threading;

public class SycnDemo extends Test{
	private String name;
	
	SycnDemo(String name){
		this.name = name;
	}
	/**
	 * @param args
	 */
	public static synchronized void staticSync(){
		System.out.println("SM1");
		System.out.println("SM2");
	}
	public synchronized void Sync(){
		System.out.println("M1");
		System.out.println("M2");
	}
	public static void main(String[] args) throws InterruptedException {
		final SycnDemo o1 = new SycnDemo("o1");
		Thread t1 = new Thread(){
			@Override
			public void run() {
				o1.Sync();
			}
		};
		Thread t2 = new Thread(){
			@Override
			public void run() {
				staticSync();
			}
		};
		Thread t3 = new Thread(){
			@Override
			public void run() {
				staticSync();
			}
		};
		
		t1.start();
		t2.start();
		t3.start();
		t1.join();
		t2.join();
		t3.join();
	}
	@Override
	void method() {
		// TODO Auto-generated method stub
		
	}


}
abstract class Test{
	abstract void method();
}
