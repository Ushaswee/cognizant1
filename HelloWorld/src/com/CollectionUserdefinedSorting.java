package com;

import java.util.*;

class Student1 implements Comparable<Student1>{
	public String name;
	public Student1(String name)
	{
		this.name=name;
	}
	public int compareTo(Student1 person)
	{
		return name.compareTo(person.name);
	}
}


public class CollectionUserdefinedSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Student1> al=new ArrayList<Student1>();
al.add(new Student1("viru"));
al.add(new Student1("saurav"));
al.add(new Student1("mukesh"));
al.add(new Student1("tahir"));
Collections.sort(al);
for(Student1 s:al)
{
	System.out.println(s.name);
}
}
}

