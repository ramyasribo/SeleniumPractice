package examples;

public class Duplicates {
	//To remove the duplicates from the given string array
		//static String remove duplicate
		int index = 0;
		for (int i=0;i<n;i++ ) {
			int j;
			for(int j=0;j<i;j++) {
				if(Str[i]==Str[j]) {
					break;
				}
			}
			
		}
		if(j==1) {
			Str[index]==Str[i];
		}
		return String.valueOf(Array.copyOf(str,index));
	}


public static void main(String[] args) {
	char str[] ="greeting from me";
	int n = str.length();
	System.out.println(removeDuplicate(str,n));
}
}
	
