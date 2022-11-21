package question1;

public class Question7 {

	public static String concatString(String word, int n) {
		String result = "";
		
		for (int i = 0; i < n; i++) {
			result += word;
		} return result;
		
		
}		
	public static void main(String[] args) {
		System.out.println(concatString("hello", 3));
	}
	
	
	
	
}
