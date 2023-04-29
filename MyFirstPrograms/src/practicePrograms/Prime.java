
package practicePrograms;
import java.util.Scanner;
public class Prime {
	public static void main(String [] args) {
		int num,i;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number");
		num =in.nextInt();
		
		for( i =1;i<=num;i++) {
			boolean isprime =true;
			if(i>1) {
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					isprime=false;
					break;
	
				}
				
		}
		} else {
			isprime =false;
			}
	      
		if(isprime==false) {
		System.out.print(i+" ");
		}
		
		}
	}
}


