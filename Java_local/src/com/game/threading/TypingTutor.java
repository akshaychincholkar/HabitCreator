package com.game.threading;

import java.util.Scanner;

class Producer implements Runnable{
	public void run() {
		System.out.println("Producer thread");
		while(true){
			Thread consumer = new Thread(new Consumer(),"consumerThread");
			consumer.start();
		}
		
		
	}	
}
class Consumer implements Runnable{
	public void run() {
		System.out.println("Consumer Thread");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		if(input.equalsIgnoreCase("exit")){
			System.exit(0);
		}
		try {
			Thread.currentThread().sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class TypingTutor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread producer = new Thread(new Producer(),"producerThread");

		producer.start();

	}

}
