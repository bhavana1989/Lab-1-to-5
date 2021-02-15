package org;

import java.util.Scanner;
	
public class SumOfCubes
{
	int i;
	int sum=0;
	public int cubes()
	{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	for(int i=1;i<=n;i++)
	{
		sum=sum+(i*i*i);
	}
		System.out.println(sum);
	return n;
	}
	public static void main(String args[])
	{
		SumOfCubes s=new SumOfCubes();
		s.cubes();
	}
}
