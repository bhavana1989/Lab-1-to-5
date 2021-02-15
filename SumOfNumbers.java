package sum;
import java.util.Scanner;

public class SumOfNumbers 
{ 
	int sum=0;
	public int calculateSum()
	{
		Scanner s=new Scanner(System.in);
		int n= s.nextInt();  
		for(int i=1;i<=n;i++)
		{
			if(i%3==0 || i%5==0)
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);
		return n;
	}
		
		public static void main(String args[])
		{
			SumOfNumbers s=new SumOfNumbers();
			s.calculateSum(); 
			
		}
}