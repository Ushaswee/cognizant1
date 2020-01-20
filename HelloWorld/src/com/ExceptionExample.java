package com;

import java.io.IOException;

public class ExceptionExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
int a=5,b=0;
try
{
System.out.println(a/b);
throw new IOException();
}
catch(ArithmeticException e)
{
	System.out.println(e.getMessage());
}
finally
{
	System.out.println("finally akways execute");
}
System.out.println("my program is executed");
}
	}
