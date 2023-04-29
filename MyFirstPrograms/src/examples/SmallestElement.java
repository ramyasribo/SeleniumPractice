package examples;

public class SmallestElement {
	
	public int finder() {
		int[] value ={10,20,1,30,40};
		int[] result =new int[value.length];
		for(int i=0;i<value.length;i++) {
			result[i]=value[i];
			
		}
		int minvalue =result[0];
		for(int i =1;i<value.length;i++) {
			if(result[i]<minvalue) {
				minvalue =result[i];
			}
		}
		
		
	return minvalue;

}
}
