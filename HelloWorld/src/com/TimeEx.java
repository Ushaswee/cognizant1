package com;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class TimeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime a = LocalTime.now();
		{
			System.out.println(a);
			LocalDateTime b = LocalDateTime.now();
			System.out.println(b);
		}
	}

}
