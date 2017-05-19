package com.game.threading;

public class HelloRunnableThread implements Runnable {
	Thread thread;
	String name;
	public HelloRunnableThread(String name){
		this.name = name;
		System.out.println("Creating the Thread:"+this.name);

	}
	public void run(){
		System.out.println("Hello! Runnable thread is running");

		
		for(int i=1; i<=5; i++){
			System.out.println(name+" executing "+i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}		
		System.out.println("Exiting thead:"+name);
	}
	public void start(){
		if(thread == null){
			thread = new Thread(this,name);
		}
		thread.start();
	}
	public static void main(String[] args) {
//		HelloRunnableThread runnableThread = new HelloRunnableThread("Thread 1");
//		Thread thread = new Thread(runnableThread);
		HelloRunnableThread thread = new HelloRunnableThread("Thread 1");
		
		thread.start();
//		thread.run();
		
//		HelloRunnableThread runnableThread2 = new HelloRunnableThread("Thread 2");
//		Thread thread2 = new Thread(runnableThread2);
		HelloRunnableThread thread2 = new HelloRunnableThread("Thread 2");
		thread2.start();
//		thread2.start();
//		thread2.run();
	}

}
