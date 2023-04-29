package examples;

public class Car1{

    // defined and initialized
	int noOfWheels=4;
	// defined
	String color;
	int noOfDoors;
	boolean carStarted=false;
	
	public void startCar(){
		if(!carStarted){
			carStarted=true;
			System.out.println("Started the "+color+" car");
		}else {
			System.out.println(color+" Car already started so not starting the car");
		}
	}
	public void stopCar(){
		// stop the car the only if it is started 
		carStarted=false;
	}	
	public void setColor(String newColor){
		color = newColor;
	}
	public void setNoOfDoors(int newDoors){
		noOfDoors = newDoors;
	}
	public String getColor(){
		return color;
	}
	public int getNoOfDoors(){
		return noOfDoors;
	}
	public int getNoOfWheels(){
		return noOfWheels;
	}
	public boolean getCarStarted(){
		return carStarted;
	}	
}