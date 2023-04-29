package examples;

import myexceptions.NotAValidNumberException;

public class Factorial {
	
		public int factFinder(String input) throws NotAValidNumberException{
			// check if the input is number
			try {
				int number = Integer.parseInt(input);
			}catch (NumberFormatException exeThrown) {
				throw new NotAValidNumberException();
			}
			int result =1;
			int number;
			for(int i=number;i>0;i--){
				result = result * number;
			}
			return result;
		}
		
	

}
