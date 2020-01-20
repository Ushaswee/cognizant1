package com;

import java.util.Scanner;

public class EggCount {
static int eggs;
static int q=0,d=0,r=0,r1=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
eggs=s.nextInt();
	q=eggs/144;
	r1=eggs%144;
	d=r1/12;
	r=r1%12;

System.out.println("gross="+q+"dozen="+d+"remaining="+r);
	}

}
