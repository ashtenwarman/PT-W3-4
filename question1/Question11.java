package question1;

public class Question11 {

	public static void main(String[] args) {
		
		double[] arr1 = {21.22, 34.96, 87.99, 99.34};
		double[] arr2 = {18.86, 33.75, 66.90, 94.48};
		
		double[] arr3 = {27.95, 34.26, 62.74, 80.11};
		double[] arr4 = {29.07, 45.53, 68.25, 93.61};
		
		System.out.println(isGreaterThan(arr1, arr2));
		System.out.println(isGreaterThan(arr3, arr4));
	}

	public static boolean isGreaterThan(double[] firstArray, double[] secondArray) {
		double sumA = 0;
		double sumB = 0;
		
		for (double c : firstArray) {
			sumA += c;
		}
		for (double d : secondArray) {
			sumB += d;
		}
		if ((sumA / firstArray.length) > (sumB / secondArray.length)) {
			return true;
		} else return false;
	}
}
