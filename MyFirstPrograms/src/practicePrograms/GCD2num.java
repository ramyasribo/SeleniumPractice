package practicePrograms;

public class GCD2num {
	public void finder(int number,int number1) {
		for(int i=1;i<number;i++) {
			if((number%i==0)&&(number1%i==0)) {
				System.out.println(i);
			}
		}
		
	}

}
