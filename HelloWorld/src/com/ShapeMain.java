package com;

public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle(1, "abc", 6, 7);
		Circle c=new Circle(9, "abc", 2);
		Square s=new Square(1,"abc", 4);
		System.out.println(s.Area());
	}

}
