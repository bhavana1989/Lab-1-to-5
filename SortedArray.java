package Exercise3;

import java.lang.reflect.Array;
import java.util.Scanner;

public class SortedArray {
	public static void main(String args[])
		 {
			int counter, i=0, j=0, temp;
			int number[] = new int[100];
			Scanner scanner = new Scanner(System.in);
			System.out.print("How many elements you want to enter: ");
			counter = scanner.nextInt();
			for(i=0; i<counter; i++)
			{
			    System.out.print("Enter Array Element"+(i+1)+": ");
			    number[i] = scanner.nextInt();
			}
			j = i - 1;     
			i = 0;         
			scanner.close();
			while(i<j)
			{
		  	   temp = number[i];
			   number[i] = number[j];
			   number[j] = temp;
			   i++;
			   j--;
			}

			System.out.print("Reversed array: ");
			for(i=0; i<counter; i++)
			{
			   System.out.print(number[i]+" ");
			}
			for (int k= 0; k < counter; k++)   
			{  
			for (int m = k + 1; m < counter; m++)   
			{  
			int tmp = 0;  
			if (number[k] >number[m])   
			{  
			tmp = number[k];  
			number[k] = number[m];  
			number[m] = tmp; 
			
			}  
			 
			}  
			System.out.println("\n After Sorting: " +number[k]);  
			}  
			
		   }
		}
		 
		
	  
	
		
			


	
	
	
	
	
	/*
	package Lab2;
	import java.util.*;
	public class EX1L2 {
		public void getSecondSmallest()
		{
			int num, key;
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter size of array");
			num=scan.nextInt();
			int arr[]=new int[num];
			System.out.println("Enter number of elements:");
			
			for(int i=0;i<num;i++)
			{
				arr[i]=scan.nextInt();
			}
			for(int i=0;i<num;i++)
			{
				for(int j=i+1;j<num;j++)
				{
					if(arr[i]>arr[j])
					{
						key=arr[i];
						arr[i]=arr[j];
						arr[j]=key;
					}
						
				}
			}
			System.out.println("Second smallest number is:" +arr[1]);
		}
		public static void main(String[]args)
		{
			new EX1L2().getSecondSmallest();
		}
	}*/
