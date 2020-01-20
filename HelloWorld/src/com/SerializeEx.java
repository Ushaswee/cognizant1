package com;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializeEx implements Serializable {  
		 public static void main(String args[]){  
		  try{    
		  SerializeEx s1 =new SerializeEx();    
		  FileOutputStream fout=new FileOutputStream("test1.txt");  
		  ObjectOutputStream out=new ObjectOutputStream(fout);  
		  out.writeObject(s1);  
		  out.flush();   
		  out.close();  
		  System.out.println("success");  
		  }catch(Exception e){System.out.println(e);} 
	}
}
