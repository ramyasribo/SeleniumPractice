package examples;

public class OddPositionArray {

	public int[] oddPositionFinder() {
		int[] value ={10,20,30,40};
		int [] result = new int[value.length];
		for(int i=0;i<value.length;i=i+2){
			result[i]=value[i];
		}
		int [] finalResult = new int[value.length/2];
		int j=0;
		for (int i = 0; i < result.length; i++) {
			if(result[i]!=0) {
				finalResult[j]=result[i];
				j++;
			}			
		}
		return finalResult;
	}
}
