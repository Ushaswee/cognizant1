package com;

abstract class AbstractClass {
	abstract void add(int a, int b); // abstract method

	void show() // non abstract method
	{
		System.out.println("this is abstract class");
	}
}

class AbstractImp1 extends AbstractClass {

	@Override
	void add(int a, int b) {
		// TODO Auto-generated method stub
System.out.println(a+b);
	}

}

public class AbstractExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractImp1 a=new AbstractImp1();
		a.add(1, 2);
	}

}
