package exercise2;

import java.util.Scanner;
class MyException extends Exception{
	private String msg;
	public MyException(String msg) {
		this.msg=msg;
	}
	public String toString()
	{
		return msg;
	}
}
public class Employee  {
	
	
		public static void main(String args[])
		{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first name:");
		 String firstname=scan.nextLine();
		 System.out.println("Enter last name:");
		 String lastname=scan.nextLine();
		try {
			if(firstname.length()==0 || lastname.length()==0) 
			{
				throw new MyException("Invalid name");
			}
			else
				System.out.println("Name="+firstname+"\t"+lastname);
				System.out.println("valid name");
		}
		catch(MyException a) {
			System.out.println(a);
		}
		}
}
