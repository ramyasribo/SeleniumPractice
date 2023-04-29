package examples;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String [] args) {
		int sum,n;
		int num1=0;
		int num2=1;

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the integer value");
		n =sc.nextInt();
		
		System.out.println(num1+" "+num2);
		 
		for(int i=0;i<n;++i) {
		sum = num1+num2;
		System.out.println(num2);
		num1=num2;
		num2=sum;
		}
		
	}	
}
