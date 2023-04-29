package examples;

import myexceptions.NotAValidMonthNumberException;
import myexceptions.NotAValidNumberException;

public class MonthFinder {

	public void printMonth(int monthNumber){
		switch(monthNumber){
	    	case 1:
	        	System.out.println("Month is January");
	       		break;
	    	case 2:
	    		System.out.println("Month is Febraury");
	    		break;
			case 3:
				System.out.println("Month is March");
				break;
			case 4:
				System.out.println("Month is april");
				break;
			case 5:
				System.out.println("Month is may");
				break;
			case 6:
				System.out.println("month is june");
				break;
			case 7:
				System.out.println("month is july");
				break;
			case 8 :
				System.out.println("month is August");
				break;
			case 9:
				System.out.println("month is september");
				break;
			case 10:
				System.out.println("month is October");
				break;
			case 11:
				System.out.println("month is November");
				break;
			case 12:
				System.out.println("month is December");
				break;
			default:
	         	System.out.println("Month number given is invalid");        
         }
         System.out.println("we are here");
	}
		/**
		 * This method will take a string that contains the month number 
		 *  and returns the month name.
		 *    Also if there is a exception/problem or deviation from expected result
		 *    it will throw NotAValidMonthNumber exception when the given string does not
		 *    contain a valid month number i.e. >=1 && <=12
		 *    it will throw NotAValidNumber exception when the string does not contain 
		 *    a valid number i.e "123x" or something like that 
		 * @param monthName - in string format
		 * @return - the month name
		 */
		public String printMonthException(String monthNumber) 
		 		throws NotAValidMonthNumberException, NotAValidNumberException{
			// convert string to integer
			int newMonthNumber=0;
			try {
				newMonthNumber = Integer.parseInt(monthNumber);
			}catch (NumberFormatException e) {
				// the string is not a number
				throw new NotAValidNumberException();
			}
			// if valid number
			if(newMonthNumber<1 || newMonthNumber>12) {
				throw new NotAValidMonthNumberException();
			}
			// number is >=1 and <=12
			String monthName=null;
			switch(newMonthNumber){
		    	case 1:
		        	monthName = "January";
		       		break;
		    	case 2:
		    		monthName = "Febraury";
		    		break;
				case 3:
					monthName = "March";
					break;
				case 4:
					monthName = "April";
					break;
				case 5:
					monthName = "May";
					break;
				case 6:
					monthName = "June";
					break;
				case 7:
					monthName = "July";
					break;
				case 8 :
					monthName = "August";
					break;
				case 9:
					monthName = "September";
					break;
				case 10:
					monthName = "October";
					break;
				case 11:
					monthName = "November";
					break;
				case 12:
					monthName = "December";
					break;
	         }
			return monthName;
		}
	}


