  package practicePrograms;

public class ArmStrong {

	public static void main(String[] args) {
	
		int n=153,temp,rem,lastDigit=0;
		temp=n;
		while(n>0) {
			rem =n%10;
			lastDigit =lastDigit+(rem*rem*rem);
			n=n/10;
			
			
		}
		System.out.println(lastDigit);
		if(lastDigit==temp) {
			System.out.println("The number is ArmStrong");
		}else
			System.out.println("The number is not ArmStrong");
	}

}
