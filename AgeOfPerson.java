package exercise1;

import java.util.Scanner;
@SuppressWarnings("serial")
class AgeException extends Exception{
	private String age;
	public AgeException(String string) {
		this.age=string;
	}
	public String toString()
	{
		return age;
	}
}
public class AgeOfPerson  {
	
	
		public static void main(String args[])
		{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Age:");
		 int age=scan.nextInt();
		try {
			if(age<15) 
			{
				System.out.println("Age= "+age);
				throw new AgeException("Invalid Age");
			}
			else
				System.out.println("Age= "+age);
				System.out.println("valid age");
		}
		catch(AgeException a) {
			System.out.println(a);
		}
		}
}





