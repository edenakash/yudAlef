import java.util.Scanner;
public class Exercises {

	public static void main(String[] args) {
		// כאן תתבצע קריאה לפונקציה אחת כל פעם
	}
// להוסיף גם את תרגיל מספר 8!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
  
	//exe 1
	/* public int avg (int x) {
			 Scanner scan = new Scanner(System.in);
			int sum = 0;
			for(int i = 0; i<x; i++) {
				System.out.println("enter your grade");
				int grade = scan.nextInt();
				sum += grade;
			}
			float avg = sum/5;
			System.out.println(avg); 
	}	*/

  //exe2
	 /* public String isEnter (String word) {
	
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
			
	// exe3
	/* public int passwordCheck (int correct) {
			Scanner scan = new Scanner(System.in);
			int attempts = 0;
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
		} */
  
  //exe4
		/* public String isPal ( String word) {
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
		/* public int allNums (int num) {
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
		
	
		//exe 6 
		/* public int multipicationChart (int tableSize) {
  
		        for (int i = 1; i <= tableSize; i++) {
		            
		            for (int j = 1; j <= tableSize; j++) {
		                
		                System.out.print(i * j + "\t");
		            }
		            
		            System.out.println(); 
		        }
		} */
		
		//exe 7
		/* public int maxAndMin (int[] grades) {
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
		
		
		//exe 9
		/* public int multiplyingWithAddition (int num1, int num2 ) {
	        int sum = 0;
	        for (int i = 0; i < num1; i++) {
	        	sum += num2;
	        	
	        }
	        
	        System.out.println(sum); 
		} */
	     
	        
	        
		//exe 10 
		/* public int equilateralTriangle (int base) {

	        // Print the triangle
	        for (int i = 1; i <= base; i++) {
	            // Print spaces
	            for (int j = 1; j <= base - i; j++) {
	                System.out.print(" ");
	            }

	            // Print '*' for the current row
	            for (int k = 1; k <= 2 * i - 1; k++) {
	                System.out.print("*");
	            }

	            // Move to the next line after each row is printed
	            System.out.println();
	        }

		}	
		} */
}
