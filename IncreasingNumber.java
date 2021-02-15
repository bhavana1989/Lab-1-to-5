package org;
	import java.util.Scanner;
	
	public class IncreasingNumber {
		public static void checkNumber() {
			Scanner number=new Scanner(System.in);
			System.out.println("Check the number is increasing: ");
			int n=number.nextInt();
			number.close();
			while(n!=0) {
				int a=n%10;
				n=n/10;
				int b=n%10;
				if(a<b) {
					System.out.println("not increasing");
					break;
				}
				else {
					if(n==0) {
						System.out.println("increasing");
					}
				}
			}
			
		}
		public static void main(String[] args) {
			checkNumber();
			
		}
	}	