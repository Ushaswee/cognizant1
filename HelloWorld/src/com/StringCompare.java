package com;

public class StringCompare {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	char[] s1 = { 'h', 'e', 'l', 'l', '0' };
	char[] s3 = { 'h', 'e', 'l', 'l', '0' };
	String s2 = new String(s1);
String s4=new String(s3);
int l1=s1.length;
int l2=s3.length;
int c=0;
{
	if(l1==l2)
	{
for(int i = 0;i<l1;i++)
	{
		for (int j = 0; j < l2; j++) {
			if (s1[i] == s3[j]) {
c++;
			}
		}
	}
		if(c==l1)
			System.out.println("equal");
		else
			System.out.println("not equal");
	}
}
	}
}
