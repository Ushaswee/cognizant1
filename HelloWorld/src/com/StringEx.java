package com;

public class StringEx {
static String s1="abc";
static String s2="pqr";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(s1.charAt(2));
	System.out.println(s1.length());
	System.out.println(s1.compareTo(s2));
	System.out.println(s1.concat(s2));
	System.out.println(s1.contains(s1));
	System.out.println(s1.endsWith("c"));
	System.out.println(s1.replace('c', 'e'));
	System.out.println(s2.indexOf('q'));
	System.out.println(s2.toUpperCase());
	System.out.println(s2.split(s2));
	}
}
