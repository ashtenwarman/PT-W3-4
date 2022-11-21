package question1;



public class Question2 {

	public static void main(String[] args) {
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

		double sum = 0;
		
		for (String s : names) {
			sum += s.length();
		} System.out.println(sum / names.length);
			
		
		for (String s : names) {
			s += " ";
			System.out.print(s);
		} 
				
	}
}		
		
		// QUESTIONS 3 AND 4:
			// 3: arrayName[arrayName.length - 1]
			// 4: arrayName[0]
	


	



