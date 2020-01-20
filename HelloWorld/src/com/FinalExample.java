package com;

class A1 {
	static final double pi = 3.14;

	void Display() {
		System.out.println("Class");
	}
}

class A2 extends A1 {

	@Override
	void Display() {
		// TODO Auto-generated method stub
		super.Display();
	}

}

public class FinalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(A1.pi);
	}

}
