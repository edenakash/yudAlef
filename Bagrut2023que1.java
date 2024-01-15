public class Bagrut2023que1 {

	public static void main(String[] args) {
		int[] arr = {3,4,9,6,8,4,2};
		int sum = arr[0];
		for (int i = 1; i < arr.length; i++) {
			arr[i] = arr[i] - sum;
			sum += arr[i];
		}

	}

}
