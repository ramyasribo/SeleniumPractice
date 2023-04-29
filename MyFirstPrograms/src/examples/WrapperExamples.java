package examples;

public class WrapperExamples {
	public void integerCompareDemo() {
		int primitiveInt =5;
		Integer objectInt = new Integer(8);
		Integer secondObjectInt = null;
		try {
			secondObjectInt = new Integer("10");
		}catch(NotEvenANumber aexp) {
			System.out.println("throws the exception when converting string 10 to integer"); ");
		}
		try {
			Integer thirdObjectInt = new Integer("shalini");
			
		}catch(NotEvenANumber exp) {
			System.out.println("throws the exception when converting strin shalini to integer");

		}
		if(objectInt.compareTo(secondObjectInt)==0){
			System.out.println("Two integers are equal");
		}else if(objectInt.compareTo(secondObjectInt)>0) {
			System.out.println("Second Intger comes first"+secondObjectInt.intValue()"then objectInt comes"+objectInt.intValue()););
		}else {
			System.out.println( "First integer comes first"+objectInt.intValue()+"then second objectInt comes"+secondObjectInt.intValue()));
		}
	
	}
	 public void longCompareDemo(){
	        long primitiveLong= 243L;
	        Long objLong= new Long(3578L);
	        Long secondObjectLong = null;
	        Long thirdObjectLong = null;

	        try{
	            secondObjectLong = new Long("692L");
	        }catch(NotEvenANumber aexp){

	            System.out.println("throws the exception when converting string 692 to long");
	        }
	        try{

	            thirdObjectLong = new Long("Long");
	        }catch(NotEvenANumber exp){

	            System.out.println("throws the exception when converting string Long to long");
	        }
	         if (ObjLong.compareTo(secondObjectLong)==0) {
	            System.out.println("Two Long variables are equal");
	        }else if(primitiveLong.compareTo(secondObjectLong)>0){
	            System.out.println("second integer comes first"+secondObjectLong.longValue()+"then objectInt comes"+primitiveLong);
	        }else{
	            System.out.println("first primitiveLong comes first"+primitiveLong+"then second objectLong comes"+secondObjectLong.longValue());
	        }
	    }

	}
}
