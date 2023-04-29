package apps;

import examples.Car;

public class CarApp{

	public static void main(String [] args){

		Car redCar = new Car();
		redCar.setColor("Red");
		redCar.setNoOfDoors(2);

		Car blueCar = new Car();
		blueCar.setColor("Blue");
		blueCar.setNoOfDoors(4);

		redCar.startCar();
		redCar.startCar();
		blueCar.startCar();

		System.out.println("The color of red car is: "+redCar.getColor());
		System.out.println("has the redCar started? : "+redCar.getCarStarted());

		// System.out.println("has the redCar started? : "+redCar.color);
	}
}