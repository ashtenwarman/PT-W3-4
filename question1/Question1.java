package question1;

public class Question1 {

	public static void main(String[] args) {
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		System.out.println(ages[ages.length-1] - ages[0]);
		
		double sum = 0;
		
		for (int i = 0; i < ages.length; i++) {
			sum = sum + ages[i];
		
		} System.out.println(sum / ages.length);
	
	} 
}	
