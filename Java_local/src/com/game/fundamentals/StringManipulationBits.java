package com.game.fundamentals;

public class StringManipulationBits {
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
		if(text.charAt(index+2) == '['){
			
			String local = text.valueOf(text.charAt(index+3));
			int localIndex = Integer.parseInt(local);
			currentIndex = localIndex;

			if(text.contains("]:")){

				String finalString = localArray[localIndex].substring(0, Integer.parseInt(localArray[localIndex].valueOf(text.charAt(text.indexOf("]:")+2))));

				return finalString;
			}else if(text.contains("]")){
				return localArray[localIndex];
			}
		}else{
			if(text.contains("%s:")){
				String local = text.valueOf(text.charAt(index+3));
				int localIndex = Integer.parseInt(local);
				String finalString = localArray[0].substring(0, Integer.parseInt(localArray[0].valueOf(text.charAt(text.indexOf("%s:")+3))));
				return finalString;
			}
			return localArray[currentIndex];
		}
		//dummy return		
		return text;
	}
}
