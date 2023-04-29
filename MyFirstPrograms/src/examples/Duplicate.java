package examples;

public class Duplicate {
	
		String result;
		int count;
	  
		public int finder(String word){
			char [] word1 = new char[word.length()];
			for(int i=0;i<word1.length;i++){
				for(int j=0;j<word1.length;j++){
					//System.out.println(i);
					System.out.println(j);
				//result[i] =word1[j];
				count++;
			}
				
		

			}
			return count;
		}
		

}
