package practicePrograms;

public class FirstNonRepeatedcharInString {

	public static void main(String[] args) {
		
		String str="rrasbmcb";
		char c[] =str.toCharArray();
		char ct[] = new char[c.length];
		int k=0;
		for(int i=0;i<str.length()-1;i++) {
			for(int j= i+1;j<str.length()-1;i++)
				if(c[i]!=c[i+1]) {
					c[i]=ct[k++];
				}	
		}
		for(int i=0;i<k-1;i++) {
		System.out.println(ct[0]);

	}
//		String arr="rrasbmcb";
//		char c[] =arr.toCharArray();
//		char temp[]= new char[arr.length()];
//		int j=0;
//		for(int i=0;i<arr.length()-1;i++){
//			if(c[i]!=c[i+1]){
//				temp[j++]=c[i];
//			}
//			//temp[j++] = arr[arr.length()-1];
//		}
//		//for( int i=0;i<j;i++) {
//			System.out.print(temp[0]);
//		//}
	}
}
