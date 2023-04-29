package examples;

import java.util.ArrayList;

public class ArrayListProj {
	public static void main(String[] args) {
		
		ArrayList fruitList = new ArrayList();
		fruitList.add("Mango");
		fruitList.add("Apple");
		fruitList.add("Strawberry");
		fruitList.add("watermelon");
		//System.out.println(fruitList);
		//fruitList.clear();
		//fruitList.remove("Strawberry");
		System.out.println(fruitList.contains("Raspberry"));
		System.out.println(fruitList);
	}

}
