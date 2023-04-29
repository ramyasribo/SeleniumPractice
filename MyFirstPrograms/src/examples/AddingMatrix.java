package examples;

public class AddingMatrix {
	public int[] finder() {
		int []matrixA ={1,2,3,4,5,6};
		int []matrixB = {5,6,7,8,9,10};
		int []matrixAdd = new int[matrixA.length];
		for(int i=0;i<matrixA.length;i++) {
			for(int j=0;j<matrixB.length;j++) {
		
			matrixAdd[i] = matrixA[i]+matrixB[j];
		}
	

}
		return matrixAdd;
}
}
