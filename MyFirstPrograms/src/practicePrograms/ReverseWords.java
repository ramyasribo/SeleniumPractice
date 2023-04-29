package practicePrograms;

public class ReverseWords {

	public static void main(String[] args) {
		
//		String [] words = {"new","old","big","small"};
//		for(int s=0;s<words.length;s++) {
//			System.out.print(words[s]+" ");
//		}
//		System.out.println("\n");
//		for(int i=words.length-1;i>=0;i--) {
//			//System.out.print(words[i]+" ");
//			char []ch = words[i].toCharArray();
//			for(int j=ch.length-1;j>=0;j--){
//			System.out.print(ch[j]);
//				
//			}
//			System.out.print(" ");
//		}
//		
//		
		
		String sentence = "This is Ramya";
		String reverse ="";
		for(int i= sentence.length()-1;i>=0;i--) {
			reverse=reverse+sentence.charAt(i);
		}
		System.out.println(reverse);

	}

}
