package question1;

public class Question9 {

	public static boolean sumOverHundred(int[] numbers) {
		
		int sum = 0;
		for (int i : numbers) {
			sum += i;
			
		}
		if (sum > 100) {
			return true;
		} else return false;
	 
	}
	
	public static void main(String[] args) {
		int[] numbers = {30, 40, 50};
		int[] moreNumbers = {9, 15, 28, 33};
		System.out.println(sumOverHundred(numbers));
		System.out.println(sumOverHundred(moreNumbers));
	
	
	}
	




}
