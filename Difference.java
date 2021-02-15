package exercise4;
import java.util.Scanner;
import java.util.*;
import java.lang.*;
public class Difference {
	public static void modifyNumber(String s) {
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<(s.length());i++) 
		{
			if(i!=s.length()-1) {
			char s1=s.charAt(i);
			char s2=s.charAt(i+1);
			int a1=Integer.parseInt(String.valueOf(s1));
			int a2=Integer.parseInt(String.valueOf(s2));
			sb.append(Math.abs(a1-a2));
		}
			else
				sb.append(s.charAt(i));
		}
		System.out.println(sb.toString());
		}
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Number");
			int n=sc.nextInt();
			String s=String.valueOf(n);
			modifyNumber(s);
		}

}