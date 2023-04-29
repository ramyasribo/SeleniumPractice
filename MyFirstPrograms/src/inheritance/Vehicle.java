package inheritance;

public class Vehicle {
	
	protected int noOfWheels;
	protected String color;
	
	public void show() {
		System.out.println("No of legs: "+noOfWheels);
		System.out.println("The color is : "+color);
	}

	public void setWheels(int newNoOfWheels) {
		noOfWheels = newNoOfWheels;
	}
	
	public void setColor(String newColor) {
		color = newColor;
	}

}
