package exerc1;
import java.util.*;
public class SecondSmallest {
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
		new SecondSmallest().getSecondSmallest();
	}
}