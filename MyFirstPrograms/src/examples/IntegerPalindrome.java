package examples;

public class IntegerPalindrome {

	public static void main(String[] args) {
		int n=121;
		int rev = 0 ;
		int rem;
	int temp=n;
		while(n>0) {
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
			
			}
		System.out.println(rev);
		if(temp==rev) 
		System.out.println("The number is a palindrome");
		else 
		System.out.println("the number is not a palindrome");
		
	}
}
