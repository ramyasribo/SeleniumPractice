package examples;

public class StringReverse {

		public String finder(String word){
			int count = word.length();
			String result = " ";
				for(int j=count-1;j>=0;j--){
				result =result+word.charAt(j);
			
				}
				return result;
	}	
	
}
