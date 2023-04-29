package inheritance;

/**
 * this is super class
 * @author ramya
 *
 */
public class Animal {
	
	protected int noOfLegs;
	protected String color;
	
	public void show() {
		System.out.println("No of legs: "+noOfLegs);
		System.out.println("The color is : "+color);
	}
	
	public void setLegs(int newNoOfLegs) {
		noOfLegs = newNoOfLegs;
	}
	
	public void setColor(String newColor) {
		color = newColor;
	}
}
