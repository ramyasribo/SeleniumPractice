package apps;

import inheritance.Animal;
import inheritance.Cat;
import inheritance.Cow;
import inheritance.Dog;

public class AnimalApp {

	public static void main(String[] args) {
		
		Dog aDog = new Dog();
		aDog.setLegs(4);
		aDog.setColor("white");
		
		aDog.show();
		aDog.says();
		
		Animal anAnimal = new Dog();
		
		anAnimal.setColor("red");
		
		// casting
		
//		Cat probCat = (Cat) anAnimal;
		Dog bDog = (Dog) anAnimal;
		bDog.says();
		
		Animal [] animals = new Animal[3];
		
		animals[0] = new Dog();
		animals[1] = new Cat();
		animals[2] = new Cow();
		
		for (int i = 0; i < animals.length; i++) {
			
			if(animals[i] instanceof Dog) {
				Dog cDog = (Dog) animals[i];
				cDog.doggy();
			}else if(animals[i] instanceof Cat) {
				Cat aCat = (Cat) animals[i];
				aCat.catty();
			}else if(animals[i] instanceof Cow) {
				Cow aCow = (Cow) animals[i];
				aCow.cowy();
			}
		}
	}
}

///   Vehicle   Car Bus Bike
///     Fruits   Banana, apple, strawberry
