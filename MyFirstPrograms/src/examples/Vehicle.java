package examples;

abstract public class Vehicle {
	int noOfWheels=4;
	boolean hasSteering= true;
	
	public int getNoOfWheels() {
		return this.noOfWheels;
	}
	public void setNoOflegs(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}
	
	public boolean getHasSteering() {
		return this.hasSteering;
	}
	public void setHasSteering(boolean hasSteering) {
		this.hasSteering = hasSteering;
	}
}
