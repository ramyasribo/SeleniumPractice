package apps;
import examples.StringReverse;
public class StringReverseApp {

	public static void main(String[] args) {
		StringReverse astringreverse = new StringReverse();
		String result = astringreverse.finder("the word");
		System.out.println("the reverse string is"+result);
	}
}
