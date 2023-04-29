package apps;

import examples.OddPositionArray;

public class OddPositionArrayApp {

	public static void main(String[] args) {
			
		OddPositionArray aOddPosition = new OddPositionArray();
		int[] resultReturned = aOddPosition.oddPositionFinder();
		for (int i = 0; i < resultReturned.length; i++) {
			int j = resultReturned[i];
			System.out.println("The element value is: "+j);
			
		}
		
		// code assist -- ctrl+spacebar
		// array --- resultReturned  -- object
		//  member of array at position i   -- resultReturned[i]  -- object
		// sysout  will convert only primitive data types and String 
		// any object other than String or primitive data types you will get hashcode
	}
}


