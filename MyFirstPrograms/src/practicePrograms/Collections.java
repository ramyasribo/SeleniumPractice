package practicePrograms;

import java.util.ArrayList;

public class Collections {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("c++");
		al.add("java");
		al.add("Python");
		al.add("PHP");
		al.add("JavaScript");
		
		System.out.println(al);
		for(String aal : al) {
			System.out.println(aal);
		}
//		System.out.println("Elements in the index 1 is:"+al.get(1));
//		System.out.println("Elements in the index 3 is"+al.get(3));
//		System.out.println("Does the list contain java:"+al.contains("java"));
//		System.out.println("Does the list contain java:"+al.contains("Java"));
//		System.out.println("Does the list contain Ramya:"+al.contains("Ramya"));
//		al.add(2,"Play");
//		System.out.println(al);
//		System.out.println("is array list empty:"+al.isEmpty());
//		System.out.println("Index of Python is:"+al.indexOf("Python"));
//		System.out.println("Size of the arraylist is:"+al.size());
//		
//		ArrayList<String> copy = ( ArrayList<String>)al.clone();
//		System.out.println("The cloned element is:"+copy);
//		
	}

}
