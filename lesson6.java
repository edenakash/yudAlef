import java.util.Scanner;
public class Lesson6Exercises {

	public static void main(String[] args) {
		Lesson6Exercises myFunctions = new Lesson6Exercises();
		Scanner scan = new Scanner(System.in);
		
		//function calling for exe1
		//myFunctions.avg();
		
		//function calling for exe2
		/* System.out.println("enter a word ");
		String word = scan.nextLine();
		myFunctions.isEnter(word); */

		
		//function calling for exe3
		/* System.out.println("enter correct password ");
		int password = scan.nextInt();
		myFunctions.passwordCheck(password); */
		
		
		//function calling for exe4
		/* System.out.println("enter text ");
		String text = scan.nextLine();
		myFunctions.isPal(text); */
		
		//function calling got exe5
		/* System.out.println("enter number");
		int num = scan.nextInt();
		myFunctions.allNums(num); */
		
		//function calling for exe6
		//myFunctions.multipicationChart();

		//function calling for exe7
		/* int[] grades = new int[7];
        myFunctions.maxAndMin(grades); */
		
		
		//function calling for exe8
		/* System.out.println("enter number");
		int num = scan.nextInt();
		myFunctions.isFibonacci(num); 
		
		if (isFibonacci(num)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        } */
		
		
		//function calling for exe9
		/* System.out.println("enter number ");
		int num1 = scan.nextInt();
		System.out.println("enter number ");
		int num2 = scan.nextInt();
		myFunctions.multiplyingWithAddition (num1, num2); */
		
		
		//function calling for exe10
		/* System.out.println("enter height ");
		int height = scan.nextInt();
		myFunctions.equilateralTriangle(height); */
		
    }
		
	
	
	//exe 1
		/* public static void avg() {
				Scanner scan = new Scanner(System.in);
				int sum = 0;
				for(int i = 0; i<5; i++) {
					System.out.println("enter your grade");
					int grade = scan.nextInt();
					sum += grade;
				}
				float avg = sum/5;
				System.out.println(avg); 
		} */
	
	//exe2
	/* public static void isEnter (String word) {
			
			Scanner scan = new Scanner(System.in);
			int sum = 1;
			String enter = "enter";
			while (!(word.equals(enter))) {
				System.out.println("enter a word");
				word = scan.nextLine();
				sum ++;
			}
			System.out.println(sum); 
	 } */
	
	
	//exe3
	/* public static void passwordCheck (int correct) {
		Scanner scan = new Scanner(System.in);
		int attempts = 0;
		if (correct >= 1000 && correct <= 9999 ) {
	    	do {
				 System.out.println("Enter password");
			     int password = scan.nextInt();
			     
			     if (password >= 1000 && password <= 9999 && password == correct) {
			    	 System.out.println("how much money?");
			    	 break;
			     }
			     else {
			    	 System.out.println("wrong code." + "you have " + (2 - attempts)+ " tries left.");
			    	 attempts++;
			    	 
			     }
			}while (attempts < 3);
			
			if (attempts == 3) {
				System.out.println("0 tries left.");
			} 
		}
		else
			System.out.println("unavailable. ");
	
	} */
	
	 //exe4
	 /* public static void isPal ( String word) {
	        int strLength = word.length();
	        String  reverseStr = "";

	        for (int i = (strLength - 1); i >=0; --i) {
	          reverseStr = reverseStr + word.charAt(i);
	        }

	        if (word.toLowerCase().equals(reverseStr.toLowerCase())) {
	          System.out.println(word + " is a Palindrome String.");
	        }
	        else {
	          System.out.println(word + " is not a Palindrome String."); 
	      
	        }
		} */
	
	//exe5
	/* public static void allNums (int num) {
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print( i );
				
				if(i != num) {
					System.out.print(",");
				}
					
			}
		}
		System.out.println(); 
	} */
	
	
	//exe6
	/* public static void multipicationChart () {
		  
        for (int i = 1; i <= 10; i++) {
            
            for (int j = 1; j <= 10; j++) {
                
                System.out.print(i * j + "\t");
            }
            
            System.out.println(); 
        }
	} */
	
	
	//exe7
	/* public static void maxAndMin (int[] grades) {
		Scanner scan = new Scanner(System.in);
	        System.out.println("enter 7 grades:");
	        for (int i = 0; i < grades.length; i++) {
	            System.out.print("grade# " + (i + 1) + ": ");
	            grades[i] = scan.nextInt();
	        }

	        
	        int minGrade = grades[0];
	        int maxGrade = grades[0];

	        for (int grade : grades) {
	            if (grade < minGrade) {
	                minGrade = grade;
	            }

	            if (grade > maxGrade) {
	                maxGrade = grade;
	            }
	        }
	        System.out.println(" minimun grade is " + minGrade);
	        System.out.println(" maximum grade is " + maxGrade); 

	} */
	
	
	//exe8
	/* public static boolean isFibonacci(int number) {
        int a = 0;
        int b = 1;

        while (a <= number) {
            if (a == number) {
                return true;
            }

            int temp = a + b;
            a = b;
            b = temp;
        }

        return false;
    } */
	
	
	//exe9
	/* public static void multiplyingWithAddition (int num1, int num2 ) {
        int sum = 0;
        for (int i = 0; i < num1; i++) {
        	sum += num2;
        	
        }
        
        System.out.println(sum); 
	} */
	
	
	//exe10
	/* public static void equilateralTriangle (int height) {

        for (int i = 1; i <= height; i++) {
        	
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
           
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

	}	*/

	
}
