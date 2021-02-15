package com.cg.eis.service;

import com.cg.eis.bean.Employee;

interface EmployeeService
{
	
}

public class Service {
	Employee e=new Employee();
	
	public void userdetails(String id,String name,double salary,String designation)
	{
		e.setId(id);
		e.setName(name);
		e.setSalary(salary);
		e.setDesignation(designation);
		
	}

	public void findInsuranceScheme(double salary) {
		salary = e.getSalary();
		if (salary>=20000 && salary<30000 ) {
			System.out.println("Insurance Scheme--> Normal Insurance Scheme");
		}
		else if (salary>=30000 && salary<50000 ) {
			System.out.println("Insurance Scheme--> Standard Insurance Scheme");
		}
		else if (salary>=50000 && salary<80000 ) {
			System.out.println("Insurance Scheme--> Premium Insurance Scheme");
		}
		
		}
	public void display()
	{
		System.out.println("Employee Id ="+ e.getId());
		System.out.println("Employee Name ="+ e.getName());
		System.out.println("Employee Salary ="+ e.getSalary());
		System.out.println("Employee Designation ="+ e.getDesignation());
	}
}

