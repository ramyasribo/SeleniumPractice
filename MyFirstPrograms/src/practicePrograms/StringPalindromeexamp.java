package practicePrograms;

public class StringPalindromeexamp {
	
	public static void main(String [] args) {
		String str ="gobg";
		boolean b = false;
		String rev ="";
		for(int i=str.length()-1;i>=0;i--) {
			rev = rev+str.charAt(i);	
	}
		for(int k=0;k<str.length();k++) {
		if(str.charAt(k)==rev.charAt(k))
		b=true;
		
		System.out.println(b);
	}
}
}