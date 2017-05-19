package com.game.fundamentals;

import java.text.DecimalFormat;
import java.util.Scanner;

public class StringPoolDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String name1 = "bittu";
		String name2 = "bittu";
		
		if(name1 == name2)System.out.println("Literals are equal");
		else System.out.println("Literals are not equal");
		
		String object1 = new String("bittu");
		String object2 = new String("bittu");
		
		if(object1 == object2)System.out.println("Objects are equal");
		else System.out.println("Objects are not equal");

		//String object
		String one = "ab"+"c";
		String two = "a"+"bc";
		
		if(one == two)System.out.println("concatinated literals are equal");
		else System.out.println("concatinated literals are not equal");
		
//		Double value = 12.123342;
//		DecimalFormat df = new DecimalFormat("#.###");
//		System.out.println("Double value: "+df.format(value));
//		int i = 4;
//        double d = 4.0;
//        String s = "HackerRank ";
//		
//        Scanner scan = new Scanner(System.in);
//		StringBuffer sb2 = new StringBuffer("Test");
//		sb2.append("this");
//		System.out.println(sb2);
//		
//        /* Declare second integer, double, and String variables. */
//        int integerInput;
//        Double doubleInput;
//        String inputString;
//
//        /* Read and save an integer, double, and String to your variables.*/
//        integerInput = scan.nextInt();
//        doubleInput = scan.nextDouble();
//        scan.nextLine();
//        inputString = scan.nextLine();
//
//        /* Print the sum of both integer variables on a new line. */
//        int sum = integerInput+i;
//        System.out.println(sum);
//        
//        /* Print the sum of the double variables on a new line. */
//		
//        double sumDouble = doubleInput+d;
//        DecimalFormat df2 = new DecimalFormat(".#");
//        System.out.println(df2.format(sumDouble));
//
//        /* Concatenate and print the String variables on a new line; 
//        	the 's' variable above should be printed first. */
//        StringBuffer sb = new StringBuffer(s);
//        sb.append(inputString);
//        System.out.println(sb);
        
        
        
        Scanner in = new Scanner(System.in);
        int aScore = 0;
        int bScore = 0;
        boolean aZero=true,aOne=true,aTwo=true,bZero=true,bOne=true,bTwo=true;
        try{

            int a0 = in.nextInt(); if(a0>100||a0<1)aZero=false;
            int a1 = in.nextInt(); if(a1>100||a1<1)aOne=false;
            int a2 = in.nextInt(); if(a2>100||a2<1)aTwo=false;
            int b0 = in.nextInt(); if(b0>100||b0<1)bZero=false;
            int b1 = in.nextInt(); if(b1>100||b1<1)bOne=false;
            int b2 = in.nextInt(); if(b2>100||b2<1)bTwo=false;
            if(!(aZero&&aOne&&aTwo))System.exit(0);
            if(!(bZero&&bOne&&bTwo))System.exit(0);
            if(a0>b0)aScore++;if(a1>b1)aScore++;if(a2>b2)aScore++;
            if(a0<b0)bScore++;if(a1<b1)bScore++;if(a2<b2)bScore++;
            	
        }catch(Exception e){
        	
        }
            System.out.println(aScore+" "+bScore);
    
	}

}
