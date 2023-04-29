package practicePrograms;

public class RemoveDuplicate {
	public static void main(String[] args) {
		int arr []= {1,2,2,3,4,5,6,6,7,8};
		int temp[]= new int[arr.length];
		int k=0;
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]!=arr[i+1]){
				temp[k++]=arr[i];
			}
			temp[k++] = arr[arr.length];
		}
		for( int j=0;j<k;j++) {
			System.out.println(temp[j]);
		}
	}

}   