
public class MoreExercises {

	public static void main(String[] args) {
		int[] array = {8,4, 5,-7, 3, 2,-2};
		System.out.println("number of odd pairs: " + oddPair(array));

	}
	
	public static int oddPair (int[] arr) {
		int oddPairs = 0;
		for (int i = 0; i < arr.length; i++) {
			for(int j = 1; j < arr.length; j++) {
				if (arr[i] +arr[j] %2 != 0) {
					oddPairs ++;
				}
			}
		}
		return oddPairs;
		
	}
	
}
