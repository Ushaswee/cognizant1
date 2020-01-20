package com;

public class WageEmployee extends EmployeeExpr {
	int numbers;
	int wages;
	@Override
	public String toString() {
		return "WageEmployee [numbers=" + numbers + ", wages=" + wages + ", id=" + id + ", name=" + name + "]";
	}

	

	public WageEmployee(int empid, int empsalary, String empname,Address addr, int numbers, int wages) {
		super(empid, empname);
		this.numbers = numbers;
		this.wages = wages;
	}

	

	public int calculateWages() {
		return getEmpsalary() * wages;
	}

	private int getEmpsalary() {
		// TODO Auto-generated method stub
		return 0;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
