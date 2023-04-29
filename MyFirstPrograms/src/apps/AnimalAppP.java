package apps;

import inheritance.DogPrac;

public class AnimalAppP {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dogGenus = DogPrac.GENUS;
		Integer.parseInt("3");
		Integer aninteger = new Integer(10);
		aninteger.intValue();
		DogPrac firstDog = new DogPrac(true);
		DogPrac specialDog = new DogPrac(false);
		boolean hasTail = firstDog.hastail;
		String dogsays = firstDog.says();
		if(dogsays.equals("woof!woof")) {
			//passed
		}else {
			//failed
		}
		hasTail = specialDog.doghastail();
	if(!hasTail) {
		//passed;
	}

}
}
