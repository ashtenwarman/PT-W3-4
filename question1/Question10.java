package question1;

public class Question10 {

	public static void main(String[] args) {

		double[] num = {35.09, 48.62, 91.33, 79.96};
		double[] num2 = {456.872, 749.638, 872.231, 108.924};
		
		System.out.println(averageNum(num));
		System.out.println(averageNum(num2));
	}
		
	public static double averageNum(double[] numbers) {
		double sum = 0;
		for (double d : numbers) {
			sum += d;
		} return sum / numbers.length;
	}
	
	
	
	
}
