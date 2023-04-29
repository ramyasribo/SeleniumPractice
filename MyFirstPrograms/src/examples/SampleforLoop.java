package examples;

import java.util.Scanner;

public class SampleforLoop {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=0;
		System.out.println("Enter the value for the range");
	     n=sc.nextInt();
	     double s=0.0;
	     for(int i=1;i<=n;i++)
	     {
	    	 s=(i+1)/2;
	    	 System.out.println(s);
	     }
		
	}

}
