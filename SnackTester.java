
public class SnackTester {

	public static void main(String[] args) {
		Snack snack1 = new Snack ("bisli", 3.50);
		Snack snack2 = new Snack ("bamba", 4.25);
		Snack snack3 = new Snack ("chips", 4.99);

		Snack[] snacksArray = {snack1, snack2, snack3};
		
		System.out.println("The total price: " + total(snacksArray));
	}
	
	public static double total (Snack[] snacks) {
		double sum = 0;
		for (int i = 0; i < snacks.length; i++) {
	        sum += snacks[i].getSnackPrice();
	    }

		return sum;
	}

}
