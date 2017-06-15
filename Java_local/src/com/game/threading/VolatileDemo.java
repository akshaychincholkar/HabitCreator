
package com.game.threading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class VolatileDemo  {
	static int x =0;
	static int y= 0;
	private synchronized static void method1(){
		++x;
		++y;
	}
	private static void method2(){
		System.out.println("x: "+x + " y: "+y);
	}
	public static void main(String[] args) {
		Thread thread1 = new Thread(){
			public void run(){
				for(int i = 0;i<10;i++){
					method1();
					try {
						Thread.sleep(2);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		};
		Thread thread2 = new Thread(){
			public void run(){
				for(int i = 0 ;i <10 ;i++){
					method2();
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		thread2.start();
		thread1.start();
		System.out.println("finally before");
		System.out.println("returning"+method());
        try (InputStream inputStream = new FileInputStream("c:/txtFile.txt")) {
            
        } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	static int  method(){
		try{
//			return 1;
		}catch(Exception e){
			try {
				throw new Exception();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			return 2;
		}finally{
			System.out.println("finally");
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return 3;
	}
}
