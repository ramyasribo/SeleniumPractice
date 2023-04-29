package apps;
import examples.CopyArray;
public class CopyArrayApp {

	public static void main(String[] args) {
		CopyArray acopyarray = new CopyArray();
		int [] returnResult = acopyarray.finder();
		for (int i = 0; i < returnResult.length; i++) {
		System.out.println("the copied array is "+returnResult[i]);

	}

	}
}