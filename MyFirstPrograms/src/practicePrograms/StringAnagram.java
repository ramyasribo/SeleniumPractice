package practicePrograms;

public class StringAnagram {
	public void finder(String name1,String name2) {
		char [] c1 = name1.toCharArray();
		char [] c2 = name2.toCharArray();
		int count = 0;
		int i,j;
		for( i =0;i<c1.length;i++) {
			for(j=0;j<c2.length;j++) {
				
				}
			if(c1[i]!=c2[j]) {
				count++;
			}
			
		}
		if(count==0) {
			System.out.println("The given String is a anagram");
		}else {
			System.out.println("The given String is not a anagram");
		}
			
	}

}
