// add exercises 8+9
public class Lesson11Exercises {

	
	public static void main(String[] args) {
	//function calling for exe1
		/* int inputNumber = 5;
		printNumbers(inputNumber); */

	//function calling for exe2
		//int inputNumber = 5; 
	    //numbersUp(inputNumber); 
		
	//function calling for exe3   
		/* int base = 9; 
	    int exponent = 8; 
	    int result = power(base, exponent);
	    System.out.println(base + " ^ " + exponent + " = " + result);	*/	
	
	//function calling for exe4
		//int inputNumber = 24; 
        //(inputNumber);
		
	//function calling for exe1A
		/* int number = 12345;
        int digitCount = countDigits(number);
        System.out.println("The number of digits in the number " + number + " is: " + digitCount); */
		
		
	//function calling for exe2A
        /* int number = 1234568;
        int evenDigitsCount = countEvenDigits(number);
        System.out.println("The number of even digits in the number " + number + " is: " + evenDigitsCount); */
	
		
	//function calling for exe3A
		/* int number = 2893467;
        int maxDigit = maxDigit(number);
        System.out.println("The largest digit in the number " + number + " is: " + maxDigit); */
		
        
	}
	
		
	//exe1
	/* public static void printNumbers(int number) {
	     if (number > 0) {
	        System.out.println(number);
	        printNumbers(number - 1);
	     }
	} */
	
	
	//exe2
	/* public static void numbersUp(int number) {
        if (number >= 1) {
            numbersUp(number - 1);
            System.out.println(number);
        }
    } */
	
	
	//exe3
	/* public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return x * power(x, n - 1);
        }
    } */
	
	
	//exe4
	/* public static void primeFactors(int number) {
        System.out.print("Prime factors of " + number + ": ");
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                System.out.print(i + " * ");
                number /= i;
            }
        }
        System.out.println();
    } */
	
	//exe1A
	/* public static int countDigits(int n) {
        if (n / 10 == 0) {
            return 1;
        } else {
            return 1 + countDigits(n / 10);
        }
    } */
	
	
	//exe2A
	/* public static int countEvenDigits(int n) {
        if (n == 0) {
            return 0;
        } else {
            int lastDigit = n % 10;
            int count = (lastDigit % 2 == 0) ? 1 : 0;
            return count + countEvenDigits(n / 10);
        }
    } */
	
	
	//exe3A
	/* public static int maxDigit(int n) {
        if (n < 10) {
            return n;
        } else {
            int lastDigit = n % 10;
            int remainingDigitsMax = maxDigit(n / 10);
            return Math.max(lastDigit, remainingDigitsMax);
        }
    } */
}
