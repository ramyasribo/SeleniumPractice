package examples;

public class demo {
	public static void main(String[] args) {
	//Write a program to swap two numbers without using any temp variable
	
	int var1 =10;
	int var2 =20;
	
	System.out.println("before swap"+var1+" "+var2);
	var1= var1+var2;
	var2= var1-var2;
	var1= var1-var2;
	System.out.println("after swap"+var1+" "+var2);

	}
	


}