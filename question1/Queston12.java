package question1;

public class Queston12 {

	public static void main(String[] args) {
		
		System.out.println(willBuyDrink(true, 11.25));
		System.out.println(willBuyDrink(true, 9.75));
		System.out.println(willBuyDrink(false, 10.75));
	}

	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside == true && moneyInPocket > 10.50) {
			return true;
		} else return false;
	}
	
	
	
	
	
}
