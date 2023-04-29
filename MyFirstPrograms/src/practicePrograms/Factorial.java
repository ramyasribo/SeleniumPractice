package practicePrograms;

public class Factorial {
	public static void main(String [] args) {
		
		int fact=5,temp=1;
		//for(int i=fact;i>1;i--) {
			//temp = temp*i;
			
		//}
		//System.out.println(temp);
		
		for(int i=1;i<=fact;i++) {
			temp=temp*i;
			
		}
		System.out.println(temp);
	}
}
