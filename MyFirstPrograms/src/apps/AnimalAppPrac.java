package apps;

import inheritance.DogPrac;
import inheritance.HumanPrac;
import inheritance.PetPrac;
import inheritance.AnimalPrac;
import inheritance.CatPrac;
import inheritance.Cow;
//polymorphism
public class AnimalAppPrac {
	
	public static void main(String[] args) {
		int animalLeg = 0;
		boolean hastail = false;
		System.out.println("the animal legs is "+ animalLeg);
		
		//AnimalPrac anAnimal = new AnimalPrac();
		//anAnimal.showProperty();
		//anAnimal.says();
	//animalLegs = anAnimal.noOfLegs;
		System.out.println("The value of animalLegs is:+animalLegs);");
	DogPrac adogprac = new DogPrac();
	//adogprac.showProperty();
	adogprac.says();
	AnimalPrac anAnimal = new HumanPrac();
	//anAnimal.showProperty();
	anAnimal.says();


	// Pet aPet = new Pet();
	// aPet.petable();
	PetPrac aDogPet = new DogPrac();
	// aDogPet.says();
	aDogPet.petable();


	PetPrac aCatpet = new CatPrac();
	aCatpet.petable();
	//aCatpet.isCute();


	anAnimal = new Cow();
	anAnimal.says();
	//anAnimal.showProperty();

}
}