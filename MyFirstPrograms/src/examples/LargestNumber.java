package examples;

public class LargestNumber {
	public int finder() {
		int []value = {10,20,30,40,50,60,70};
		int []result = new int[value.length];
		for(int i=0;i<value.length;i++) {
			result[i]=value[i];
			
		}
		int maxValue =result[0];
		for(int i=1;i<value.length;i++) {
			if(result[i]>maxValue) {
				maxValue =result[i];
				
			}
		}
	return maxValue;
	}
}