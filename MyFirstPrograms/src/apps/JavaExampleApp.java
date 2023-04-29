package apps;
import examples.JavaExample;
public class JavaExampleApp {
	
		  public static void main(String[] args) { 
			  JavaExample ajavaexample = new JavaExample();
			  int[] returnResult = ajavaexample.finder();
			  System.out.println("the smallest number in array is"+returnResult);

		  }
		}


