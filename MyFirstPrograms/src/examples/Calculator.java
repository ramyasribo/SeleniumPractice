package examples;

import myexceptions.ReminderNotZeroException;

public class Calculator {
	
	/**
	 *  This method will demo the use of in-built exception and custom exception
	 * 	this method will divide two interger and returns the result.
	 * 
	 *  	It will throw ArithemeticException if you try to divide by zero
	 *  and it will throw ReminderNotZeroException if the reminder from the division is not zero
	 *  
	 * @param firstNumber
	 * @param secondNumber
	 * @return
	 * @throws ArithmeticException
	 * @throws ReminderNotZeroException
	 */
	public int divide(int firstNumber, int secondNumber) throws ReminderNotZeroException{
		int result = firstNumber/secondNumber;
		if(result!=0) {
			throw new ReminderNotZeroException();
		}
		return result;
	}
	

	public float divide(float firstNumber, float secondNumber) throws ReminderNotZeroException{
		float result = firstNumber/secondNumber;
		if(result!=0) {
			throw new ReminderNotZeroException();
		}
		return result;
	}	
	/// please java calculate divide of 10 and 5
}

