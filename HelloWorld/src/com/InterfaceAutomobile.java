package com;
abstract class Automobile1
{
	String modelName;
	void setmodelName(String modelName)
	{
		this.modelName=modelName;
	}
	String show()
	{
		return modelName;
	}
}
class Automobile2 extends Automobile1 implements Airauto,Train
{

	@Override
	public int Airauto(int a) {
		// TODO Auto-generated method stub
		return a;
	}

	@Override
	public int Train(int b) {
		// TODO Auto-generated method stub
		return b;
	}
	
}
interface Airauto
{
	int Maxspeed=100;
	int Airauto(int a);
}
interface Train
{
	int Maxspeed=50 ;
	int Train(int b);
}
public class InterfaceAutomobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automobile2 a=new Automobile2();
		Automobile2 b=new Automobile2();
		a.setmodelName("airbus1520");
		b.setmodelName("train123");
		System.out.println("aeroplane is flying with"+a.Airauto(90));
		System.out.println("max speed"+Airauto.Maxspeed);
		System.out.println("ship is sailing with"+a.Train(30));
		System.out.println("max speed"+Train.Maxspeed);
	}

}
