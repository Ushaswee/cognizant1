package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileIOExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	FileOutputStream fout=new FileOutputStream("D:\\test1.txt");
	String s="hello";
	byte b[]=s.getBytes();
	fout.write(b);
	fout.close();
System.out.println("success");
}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
try
{
	FileInputStream fin=new FileInputStream("D:\\test1.txt");
	int i=0;
	while((i=fin.read())!=-1)
	{
System.out.print((char)i);
	}
fin.close();
}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}
	

