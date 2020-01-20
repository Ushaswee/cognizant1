package com;
abstract class Person
{
	abstract void eat();
}
public class TestAnonymousInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Person p=new Person()
{
	void eat()
	{
		System.out.println("nice fruits");
	}
};
p.eat();
	}
}
