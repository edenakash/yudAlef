
public class Bagrut2022que1 {

	public static void main(String[] args) {
		 int[] array1 = {2, 3, 4, 5, 6};
	        int[] array2 = {3, 4, 5, 7, 7, 3, 5};

	        int[] resultArray = multiplyArrays(array1, array2);

	        
	        for (int i = 0; i < resultArray.length; i++) {
	            System.out.print(resultArray[i] + " ");
	        }
	}
	public static int[] multiplyArrays(int[] array1, int[] array2) {
        int length1 = array1.length;
        int length2 = array2.length;
        int maxLength = Math.max(length1, length2);

        int[] resultArray = new int[maxLength];

        
        for (int i = 0; i < maxLength; i++) {
            int value1 = (i < length1) ? array1[i] : 1; 
            int value2 = (i < length2) ? array2[i] : 1;

            resultArray[i] = value1 * value2;
        }

        return resultArray;
    }
}
