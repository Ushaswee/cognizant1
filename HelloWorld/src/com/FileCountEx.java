package com;

import java.io.FileInputStream;

public class FileCountEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int c=0;
try{
	FileCountEx f=new FileCountEx();
	FileInputStream fin=new FileInputStream("test.txt");
	int i=0;
	while(i=fin.read())!=-1){
	System.out.println((char)i);
}
	fin.close();
}catch(Exception e){System.out.println(e);
}
	}
	
	}


