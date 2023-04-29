package practicePrograms;

public class StringPalindrome {

	public static boolean isPalindrome(String str) {
		

		
		  String rev = "";
		  
	        // Initializing a new boolean variable for the
	        // answer
	 
	        for (int i = str.length() - 1; i >= 0; i--) {
	            rev = rev + str.charAt(i);
	        }
	 char str1[]=str.toCharArray();
	char rev1[]=rev.toCharArray();
	 
	        // Checking if both the strings are equal
	        for (int k = str1.length-1; k >= 0; k--) 
	        if (str1[k]!=rev1[k])
	            return false;
	        
	        return true;
	    }
	    public static void main(String[] args)
	    {
	        // Input string
	        String str = "geeks";
	 
	        // Convert the string to lowercase
	        str = str.toLowerCase();
	        boolean A = isPalindrome(str);
	        System.out.println(A);
	    }
	
		
	
		
		
		

}
