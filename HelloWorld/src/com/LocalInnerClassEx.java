package com;

public class LocalInnerClassEx {
	private int data = 30;

	void display() {
		class Local {
			void msg() {
				System.out.println(data);
			}
		}
		Local l = new Local();
		l.msg();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalInnerClassEx obj = new LocalInnerClassEx();
		obj.display();
	}

}
