package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.service.Service;

public class User {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Employee Id");
		String id=s.next();
		System.out.println("Enter Employee Name");
		String name=s.next();
		System.out.println("Enter Employee Salary");
		Double salary=s.nextDouble();
		System.out.println("Enter Employee Designation");
		String designation=s.next();
		Service obj=new Service();
		obj.userdetails(id,name,salary,designation);
		obj.findInsuranceScheme(salary);
		obj.display();
		
		
		
	}

}


