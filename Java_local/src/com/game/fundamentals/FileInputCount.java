package com.game.fundamentals;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileInputCount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("H:\\workspace\\juno\\Java\\src\\com\\game\\fundamentals\\file.txt"));
			int input = 1;
			StringBuffer read = new StringBuffer(br.readLine());
			int count = 0;
			while(read!=null){
				String arrayString[] = read.toString().split(",");
				for(int i=0;i<arrayString.length;i++){
					if(Integer.parseInt(arrayString[i]) == input)count++;
				}
				
				String nextLine= br.readLine();
				if(nextLine != null)read = new StringBuffer(nextLine);
				else read = null;
				if(read == null)break;
			}
			System.out.println("Count:"+count);	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
