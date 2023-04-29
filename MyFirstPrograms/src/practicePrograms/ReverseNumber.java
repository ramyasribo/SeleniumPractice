package practicePrograms;

public class ReverseNumber {
	public void finder(int num) {
		int reverse = 0,lastDigit;
		
		for(int i=0;i<=num;i++) {
			lastDigit=num%10;
			reverse = reverse*10+lastDigit;
			num =num/10;
			
		}
		System.out.println(reverse);
		
	}

}
