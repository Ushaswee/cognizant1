package com;

public class MemberInnerClass {
private int data=30;
class Inner
{
	void msg()
	{
		System.out.println("data"+data);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberInnerClass m=new MemberInnerClass();
		MemberInnerClass.Inner in=m.new Inner();
		in.msg();
	}

}
