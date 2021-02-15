package org;
import java.util.Scanner;
public class PrimeNumberCount{
	public static void main(String[] args)
		{
		    Scanner sc=new Scanner(System.in);
		    int num;
			int count;
			System.out.println("enter the number=");
			num=sc.nextInt();
			for(int i=2;i<=num;i++)
			{
			    count=0;
			    for(int j=2;j<i;j++)
			    {
			        if(i%j==0)
			            count=count+1;
			    }
			    if(count==0)
			        System.out.println(i);
		    }
		}    
	}
