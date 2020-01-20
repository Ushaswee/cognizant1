package com;
class Ao
{
	Ao()
	{
		System.out.println("Ao()");
	}
}
	class B extends Ao
	{
		B()
		{
		System.out.println("B()");
		}
	}
public class SuperConstructor {
	public static void main(String ar[]) {
		Ao a=new Ao();
		B b=new B();
	}
}
