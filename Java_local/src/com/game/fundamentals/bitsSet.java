package com.game.fundamentals;

public class bitsSet {
	private static int currentIndex = 0;
	private static int stringPointer = 0;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "Smart site India comparison best";
		String f = "%sprix is the %s[4] online %s[3]:6 shopping %s:3 in ";
		
		String[] sArray = f.split(" ");
		for(int i = 0; i < sArray.length ; i++){
			if(sArray[i].contains("%s")){
				System.out.println(processFormatting(sArray[i],s,i));
			}
		}
	}
	public static String processFormatting(String text, String formal,int formalIndex){
		int index = text.indexOf("%s");
		String[] localArray = formal.split(" ");

		try{
			
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Please enter appropriate index");
		}
//		System.out.print(index+" "+text.charAt(index+2));
		if(text.charAt(index+2) == '['){
//			System.out.print(true);
			
			String local = text.valueOf(text.charAt(index+3));
			int localIndex = Integer.parseInt(local);
			currentIndex = localIndex;
//			System.out.print(" "+localArray[localIndex]);
			if(text.contains("]:")){
//				System.out.print("->"+localArray[localIndex].valueOf(text.charAt(text.indexOf("]:")+2)));
				String finalString = localArray[localIndex].substring(0, Integer.parseInt(localArray[localIndex].valueOf(text.charAt(text.indexOf("]:")+2))));
//				System.out.println(" ****"+finalString+"**");
				return finalString;
			}else if(text.contains("]")){
				return localArray[localIndex];
			}
		}else{
//			System.out.print(false);
//			System.out.print("**"+localArray[currentIndex]+"**");
			if(text.contains("%s:")){
//				System.out.print("Mil gaya reee");
				String local = text.valueOf(text.charAt(index+3));
				int localIndex = Integer.parseInt(local);
//				System.out.print("Local:"+local);
				String finalString = localArray[0].substring(0, Integer.parseInt(localArray[0].valueOf(text.charAt(text.indexOf("%s:")+3))));
//				System.out.print("Final one:"+finalString);
				return finalString;
			}
			return localArray[currentIndex];
		}
		//dummy return		
		return text;
	}
}
