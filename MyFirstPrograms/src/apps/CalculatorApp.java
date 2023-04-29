package apps;

import examples.Calculator;
import myexceptions.ReminderNotZeroException;

public class CalculatorApp {

	public static void main(String[] args) {

		//   numbers
		//  negative , positive, zero
		// fractions

		// two +  ====   positive
		// two -  ----   postive
		// one + one -  === negative
		// two fractions --- fraction
		// one fraction one integer --- fraction
		// one zero first number -- 0
		// zero second number  --- infinity
		
		Calculator aCalc = new Calculator();
		try {
			// test 1
			int intResult = aCalc.divide(10, 6);
			if(intResult==2) {
				System.out.println("Test passed");
			}else {
				System.out.println("Test failed");
			}
			//test 2
			// test 3
			// test 4
			float floatResult = aCalc.divide(6.25f, 1.25f);
			if(floatResult==5.0f) {
				System.out.println("Test passed");
			}else {
				System.out.println("Test failed");
			}
			// test 6
			intResult = aCalc.divide(0, 5);
			if(intResult==0) {
				System.out.println("Test passed");
			}else {
				System.out.println("Test failed");
			}
			// test 7
			try {
				intResult = aCalc.divide(10, 0);
			}catch(ArithmeticException exceptionThrown) {
				System.out.println("You tried to divide by zero, please use different number");
			}	
		}catch(ReminderNotZeroException exceptionThrown) {
			System.out.println("The reminder is not zero, please give two correct number that give reminder zero");
		}
	}
}
