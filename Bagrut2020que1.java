public class Bagrut2020que1 {

	public static void main(String[] args) {
		int[] array = {3, -2, 6, 2, 1, 3};
		int num = 9;
		System.out.println(above(array, num));

	}
	
	public static int above (int[] arr, int num) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (sum > num) {
				return i;
			}

			
		}
		return -1;
	}	

}
