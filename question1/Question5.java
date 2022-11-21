package question1;

import java.util.Arrays;

public class Question5 {

	public static void main(String[] args) {
	
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
			
		int[] nameLengths = new int[names.length];
			
			for (int i = 0; i < names.length; i++) {
				nameLengths[i] = names[i].length();
		} 
				
			System.out.println(Arrays.toString(nameLengths)); 
		
			
			//QUESTION 6			
			int sum = 0;
			
			for (int i : nameLengths) {
				sum += i; 
			} System.out.println(sum);
	
	
	
	}

}
