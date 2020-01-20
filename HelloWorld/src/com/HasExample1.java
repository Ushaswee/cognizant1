package com;
class Engine
{
	int engineNo,age;
	String fuelType;
	@Override
	public String toString() {
		return "Engine [engineNo=" + engineNo + ", age=" + age + ", fuelType=" + fuelType + "]";
	}
	
	public Engine(int engineNo, int age, String fuelType) {
		super();
		this.engineNo = engineNo;
		this.age = age;
		this.fuelType = fuelType;
	}
	public int getEngineNo() {
		return engineNo;
	}
	public void setEngineNo(int engineNo) {
		this.engineNo = engineNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	
}
class Car
{
	Engine e;
	int carnumber;
	String carmode;
	@Override
	public String toString() {
		return "Car [e=" + e + ", carnumber=" + carnumber + ", carmode=" + carmode + "]";
	}
	
	public Car(Engine e, int carnumber, String carmode) {
		super();
		this.e = e;
		this.carnumber = carnumber;
		this.carmode = carmode;
	}
	
	public Car(int i, int j, String string, int k, String string2) {
		// TODO Auto-generated constructor stub
	}

	public Engine getE() {
		return e;
	}
	public void setE(Engine e) {
		this.e = e;
	}
	public int getCarnumber() {
		return carnumber;
	}
	public void setCarnumber(int carnumber) {
		this.carnumber = carnumber;
	}
	public String getCarmode() {
		return carmode;
	}
	public void setCarmode(String carmode) {
		this.carmode = carmode;
	}
	
	
}
public class HasExample1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car(new Engine(10,20,"petrol"),3567,"maruti");
		System.out.println(c);
	}
}
