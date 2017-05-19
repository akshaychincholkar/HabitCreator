package com.game.Interfaces;
abstract class Dress{
	public final void company(){
		System.out.println("GAME");
	}
	public abstract void category();
}
class MaleDress extends Dress{

	@Override
	public void category() {
		System.out.println("Mens");
	}
//	public void company(){
//		System.out.println("PSL");
//	}
}
class FemaleDress extends Dress{

	@Override
	public void category() {
		System.out.println("Female");
	}
	
}
public class AbstractClassImpl {

	public static void main(String[] args) {
		MaleDress md = new MaleDress();
		md.company();
		md.category();
		FemaleDress fd = new FemaleDress();
		fd.company();
		fd.category();
		
		
	}

}
