package inheritance;

public class DogPrac extends AnimalPrac implements PetPrac {
	 public static String GENUS = "canine";

	    public int noOfLegs;

	  ///  this is the default constructor that one that was there from
		/// Object classes when we did not define it
		/// but after overloading with boolean we have to give this
		// other wise we will get compilation error
	  public DogPrac(){
	  	super();
	  }

	//// this is the overloaded constructor that take boolean to change
	  /// the tail variable in this class
	  public DogPrac(boolean youWantTail){
	  	  super();
	  	  this.hastail = youWantTail;
	  	  /// i need to create dog here

	  }
	  public String says() {
		  System.out.println("Woof!Woof");
		  return "woofwoof";
	  }
	  
	  public boolean doghastail(){
		  return this.hastail;
	  }

	
	public void petable() {
		System.out.println("Im dog pet");
		
		
	}

	

}
