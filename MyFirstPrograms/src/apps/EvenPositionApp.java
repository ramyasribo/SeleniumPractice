package apps;
import examples.EvenPosition;

public class EvenPositionApp {
	public static void main(String[] args) {
		EvenPosition aEvenPosition = new EvenPosition();
		int[] resultReturned = aEvenPosition.evenPositionFinder();
		for (int i = 0; i < resultReturned.length; i++) {
			int j = resultReturned[i];
			System.out.println("The element value is: "+j);
		}
}
}