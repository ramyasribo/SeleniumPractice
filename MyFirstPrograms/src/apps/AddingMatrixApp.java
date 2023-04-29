package apps;
import examples.AddingMatrix;

public class AddingMatrixApp {

	public static void main(String[] args) {
		AddingMatrix aaddingmatrix = new AddingMatrix();
		int []resultReturned =aaddingmatrix.finder();
		for(int i=0;i<=resultReturned.length;i++) {
		System.out.println("the adding of two matrix is"+resultReturned);
		}
	}

}
