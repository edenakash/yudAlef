import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Lesson9Exercises {

	public static void main(String[] args) {
		
		//function calling for exe1
		
		/* int[] array = {3, 7, 13, 5, 9};
        int index = 2;

        System.out.println("Original array: " + java.util.Arrays.toString(array));
        arrayCheck(array, index);
        System.out.println("New array: " + java.util.Arrays.toString(array)); */

		//function calling for exe2
		//avgOfGrade();
		
	
		//function calling for exe3
		//minGrade();
		
		//function calling for exe4
		//int[] array = {2,7,4,9,3,6,3,0,5};
		//oddFollowing(array);
		
		
		//function calling for exe5
		//numInRandomArray(99);
		
		
		//function calling for exe6
		//SumInRandom();
		
		//function calling for exe7
		//endOfArrayIsMax();
		
		
	}
	
	
	//exe1
	/* public static void arrayCheck(int[] arr, int index) {
        
        if (index >= 0 && index < arr.length) {
            
            if (arr[index] % 2 != 0) {
                
                if (arr[index] % 2 == 1) {
                    arr[index]++;
                } else {
                    arr[index]--;
                }
            }
        } else {
            System.out.println("Invalid index");
        }
    } */
	
	
	//exe2
	/* public static void avgOfGrade() {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter grade ");
			arr[i] = scan.nextInt();
		}
		int sum = 0;
		float avg = 0;
		for (int j = 0; j < arr.length; j++) {
			sum += arr[j];
			
		}
		avg = sum/5;
		System.out.println(avg); 
		
	} */

	//exe3
	/* public static void minGrade() {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter grade ");
			arr[i] = scan.nextInt();
		}
		int minValue = arr[0];
		for (int j = 0; j < arr.length; j++) {
            minValue = Math.min(minValue, arr[j]);
            
	}
		
		System.out.println(minValue);
	
	} */
	
	
	//exe4
	/* public static void oddFollowing(int arr[] ){
		
		boolean isOdd = false;
		for (int i = 0; i < arr.length - 1; i++) {
	        if (arr[i] % 2 != 0 && arr[i + 1] % 2 != 0) {
				System.out.println(arr[i] + "," + arr[i+1]);
				isOdd= true;
			}
		}
		if (!isOdd) {
			System.out.println("no matching found");
		}
	} */
	
	
	//exe5
	/* public static void numInRandomArray(int num) {
		Random random = new Random();
		System.out.println(num);
        int[] randomNumbers = new int[10];
        for (int i = 0; i < 10; i++) {
            randomNumbers[i] = random.nextInt(100);
        }
        System.out.println(java.util.Arrays.toString(randomNumbers));
        boolean inArray = false;
        for (int j = 0; j < 10; j++) {
        	if( randomNumbers[j] == num) {
        		inArray = true;
        	}
        }
        if(inArray) {
        	System.out.println("true");
        }
        else {
        	System.out.println("false");
        }
	} */
	
	
	//exe6
	/* public static void SumInRandom() {
		Random random = new Random();
	    int[] randomNumbers = new int[10];
	    boolean isEvensum = false;
	    
	    for (int i = 0; i < 10; i++) {
	        randomNumbers[i] = random.nextInt(100);
	    }
	    System.out.println(java.util.Arrays.toString(randomNumbers));
	    for (int i = 0; i < randomNumbers.length - 1; i++) {
	        if ((randomNumbers[i] + randomNumbers[i + 1]) % 2 == 0) {
				System.out.println(randomNumbers[i] + "," + randomNumbers[i+1]);
				isEvensum= true;
			}
		}
		if (!isEvensum) {
			System.out.println("no matching found");
		}
	} */
	
	//exe7
	/* public static void endOfArrayIsMax() {
		Random random = new Random();
	    int[] randomNumbers = new int[10];
	    int[] newArray = Arrays.copyOf(randomNumbers, randomNumbers.length);
	    for (int i = 0; i < 10; i++) {
	        randomNumbers[i] = random.nextInt(100);
	    }
	    System.out.println("original array: " + java.util.Arrays.toString(randomNumbers));
	    
	    int maxIndex = 0;
        int maxValue = randomNumbers[0];
        
        for (int i = 1; i < randomNumbers.length; i++) {
        	if (randomNumbers[i] > maxValue) {
                maxValue = randomNumbers[i];
                maxIndex = i;
                
            }
        }
        System.out.print("new array: [");
        for (int i = 0; i < randomNumbers.length; i++) {
            if (i != maxIndex) {
                System.out.print(randomNumbers[i] + ", ");
            }
        }
        System.out.println(maxValue + "]");
	} */
	
}
