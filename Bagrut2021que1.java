import java.util.Scanner;
public class Bagrut2021que1 {

	public static void main(String[] args) {
		 int[] array = {1, 2, 3, 4, 5, 6};
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Original array: [1,2,3,4,5,6]  ");
		 System.out.print("Enter a number between 1-6  ");
	        int num = scan.nextInt();
		 int[] resultArray = isDifferent(array, num);

	        
	     for (int i = 0; i < resultArray.length; i++) {
	            System.out.print(resultArray[i] + " ");
	        }
	}

	
public static int[] isDifferent (int[] arr, int num) {
	int count = 0;
	for(int i = 0; i< arr.length; i++) {
		if (arr[i] != num) {
			count++;
		}
	}
	int[] arr2 = new int[count];
	int index = 0;
	for(int j = 0; j < arr.length; j++) {
		if(arr[j] != num) {
			arr2[index] = arr[j];
			index++;
		}
	}
	
	return arr2;
}

}
