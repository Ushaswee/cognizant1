package com;

public class Employee {
	 int empid, empsalary;
	 String empname;
	 Address addr;
	 
	 @Override
	public String toString() {
		return "Employee [empid=" + empid + ", empsalary=" + empsalary + ", empname=" + empname + ", addr=" + addr
				+ "]";
	}

	

	public Employee(int empid, int empsalary, String empname,Address addr) {
		super();
		this.empid = empid;
		this.empsalary = empsalary;
		this.empname = empname;
		this.addr=addr;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public int getEmpsalary() {
		return empsalary;
	}

	public void setEmpsalary(int empsalary) {
		this.empsalary = empsalary;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Employee e = new Employee(1, 2500, "swee");
		//System.out.println("id:" + empid + "salary:" + empsalary + "name:" + empname);
	}

}
