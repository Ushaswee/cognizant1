package com;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
class EmployeeExpr
{
	int id;
	String name;
	public EmployeeExpr(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
}
public class LambdaExample {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
		List <EmployeeExpr> list=new ArrayList<EmployeeExpr>();
		 list.add(new EmployeeExpr(123,"abc"));
		 list.add(new EmployeeExpr(456,"def"));
		 list.add(new EmployeeExpr(789,"lkht"));
		 list.add(new EmployeeExpr(643,"uyjf"));
		 Stream<EmployeeExpr> filtered_data = list.stream().filter(p -> p.id > 643);
		filtered_data.forEach(  
				EmployeeExpr-> System.out.println(EmployeeExpr.id+": "+EmployeeExpr.name));
		 
	}

}
