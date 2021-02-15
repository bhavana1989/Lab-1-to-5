package com;
import java.util.*;
public class CheckNumber {
	public static void main (String args[])
	{
		   Scanner scan = new Scanner(System.in);
		   int n= scan.nextInt();
		   while(n!=1)
		   {
			   if(n%2==0)
			   {
				   System.out.println("number is a power of 2" );
				   n=n/2;
			   }
			   }
			   	System.out.println("number is not a power of 2" );
				   scan.close();
	}
}