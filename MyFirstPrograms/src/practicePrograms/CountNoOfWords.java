package practicePrograms;

public class CountNoOfWords {
	
	public void finder(String str) {
		int count = 0;
		for (int i = 0; i <str.length()-1; i++)
        {
            if((str.charAt(i) == ' ') && (str.charAt(i+1) != ' '))
            {
                count++;
            }
            
        }
		System.out.println("The number of words in the string is"+count);
	}

}
