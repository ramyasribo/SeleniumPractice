package examples;

public class IfElseHR {
	/*Given an integer,n , perform the following conditional actions:

If n is odd, print Weird
If n is even and in the inclusive range of 2 to 5 , print Not Weird
If n is even and in the inclusive range of 6 to 20, print Weird
If n is even and greater than 20, print Not Weird
Complete the stub code provided in your editor to print whether or not n is weird.
*/
	
	
	public int weird(int n) {
	
		if(n%2==1) {
			System.out.println("Weird");
		}else if(n%2==0&&(n>2&&n<5)) {
			System.out.println("Not weird");
		}else if(n%2==0&&(n>6&&n<20)) {
			System.out.println("Weird");	
		}else if(n%2==0&&(n>20)) {
			System.out.println("Not Weird");
		}
		
	return n;
	}
}
