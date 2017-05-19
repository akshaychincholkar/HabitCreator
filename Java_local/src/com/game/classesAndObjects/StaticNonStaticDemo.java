package com.game.classesAndObjects;

public strictfp class StaticNonStaticDemo {
	static int counter = 0;
	static{
		System.out.println("Entered into the static initialization block");
//		counter = this.counter + 1;    			//can't use this in static block
	}
	//instance initialization block
	{
		System.out.println("Entered into the non-static initialization block");
	}
	public StaticNonStaticDemo() {
	System.out.println("Entered into the constructor");	
	}
	public void instanceMethod(){
		System.out.println("Entered into the instance method");
		NonStaticInnerClass obj2 = new NonStaticInnerClass();
	}
	public static void staticInstanceMethod(){
		System.out.println("Entered into the static instance method");
		class staticMethodInnerClass{}
	}
	public static void main(String[] args){
		System.out.println("Entered into the main");
		new StaticNonStaticDemo();
		new StaticNonStaticDemo().instanceMethod();
//		StaticNonStaticDemo.staticInstanceMethod();
//		StaticNonStaticDemo.InnerClass obj = new StaticNonStaticDemo.InnerClass();
//		new StaticNonStaticDemo.InnerClass().staticClassStaticMethod();
//		NonStaticInnerClass obj2 = new NonStaticInnerClass(); 			//non allowed as it is non static
//		static class Innerclass{}; //not allowed
		//local inner class
		strictfp class InnerClass{
			private int id = 1;
//			Cannot define static initializer in inner type InnerClass
//			static{}
			{
				
			}
			
		}
	}
	strictfp static class InnerClass{
		static{
			System.out.println("STATIC INNER:Static initilization block ");
		}
		{
			System.out.println("STATIC INNER:Instance initialization block static inner class");
		}
		public InnerClass() {
			System.out.println("STATIC INNER:static inner class constructor");
		}
		void staticClassMethod(){
			System.out.println("STATIC INNER: Non static method of static inner class");
		}
		static void staticClassStaticMethod(){
			System.out.println("STATIC INNER: Static method of the static inner class");
		}

        // StaticNestedClass can declare member interfaces.
        interface I {
        }
	}
	strictfp class NonStaticInnerClass{
//		static void method(){}
		{
			System.out.println("Instance initialization block for non-static inner class");
		}
		public NonStaticInnerClass() {
			System.out.println("Non-static inner class constructor");
		}
	}
	

}
