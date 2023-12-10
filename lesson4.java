import java.util.Random;
import java.util.Scanner;
public class Lesson4Exerscises {

	public static void main(String[] args) {
		
		/* Scanner scan = new Scanner(System.in);

        // קליטת שלושה שמות מהמשתמש
        System.out.print("הזן שם ראשון: ");
        String name1 = scan.nextLine();

        System.out.print("הזן שם שני: ");
        String name2 = scan.nextLine();

        System.out.print("הזן שם שלישי: ");
        String name3 = scan.nextLine();

        // מיון והדפסת השמות בסדר עולה מבחינת סדר מילוני
        if (name1.compareTo(name2) <= 0 && name1.compareTo(name3) <= 0) {
            System.out.println(name1);
            if (name2.compareTo(name3) <= 0) {
                System.out.println(name2);
                System.out.println(name3);
            } else {
                System.out.println(name3);
                System.out.println(name2);
            }
        } else if (name2.compareTo(name1) <= 0 && name2.compareTo(name3) <= 0) {
            System.out.println(name2);
            if (name1.compareTo(name3) <= 0) {
                System.out.println(name1);
                System.out.println(name3);
            } else {
                System.out.println(name3);
                System.out.println(name1);
            }
        } else {
            System.out.println(name3);
            if (name1.compareTo(name2) <= 0) {
                System.out.println(name1);
                System.out.println(name2);
            } else {
                System.out.println(name2);
                System.out.println(name1);
            }
        } */
        
		//exe2
		/* Scanner scan = new Scanner(System.in);

        // קליטת משפט מהמשתמש
        System.out.print("הזן משפט הכולל 4 מילים: ");
        String sentence = scan.nextLine();

        // חישוב והדפסת מספר התווים
        int counter = sentence.length();
        System.out.println("the amount of letters: " + counter); */
		
		
		//exe3
		/* Scanner scan = new Scanner(System.in);

        
        System.out.print("enter a 3 word string");
        String word = scan.nextLine();

        
        boolean isPalindrome = checkPalindrome(word);

        
        if (isPalindrome) {
            System.out.println("the string is a palindrome ");
        } else {
            System.out.println("the string isnt a palindrome ");
        } */

		
		//exe4
		/* Scanner scan = new Scanner(System.in);

   
        System.out.print("enter a 3 word string ");
        String inputString = scan.nextLine();

        
        if (isValidInput(inputString)) {
            
            System.out.println("reversed string: " + reverseString(inputString));
        } else {
            System.out.println("this input isnt 3 letters long.");
        } */
		
		
		//exe5
		/* Scanner scanner = new Scanner(System.in);

        
        System.out.print("enter a 4 letter word ");
        String inputString = scanner.nextLine();

        
        if (isValidInput(inputString)) {
            
            String fixedString = replaceVowels(inputString);

            
            System.out.println("fixed string: " + fixedString);
        } else {
            System.out.println("your input isnt 4 letters long.");
        } */
		
		
		//exe6
		/* Random random = new Random();
		
	    int randomNumber = random.nextInt(100);  
	    System.out.println("the random number is: " + randomNumber);
  
	    analyzeNumber(randomNumber); */

	}
	
	//exe3 function
	/*  public static boolean checkPalindrome(String str) {
		if(str.length() == 3) {
	        int length = str.length();
	        
	        
	        for (int i = 0; i < length / 2; i++) {
	            if (str.charAt(i) != str.charAt(length - i - 1)) {
	                return false;
	            }
	        }
	        return true;
	}
		return false;
	} */
	
	
	//exe4 functions
	/* public static boolean isValidInput(String str) {
        return str.length() == 3;
    }

    
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }

        return reversed.toString();
    } */
	
	
	//exe5 functions
	/* public static boolean isValidInput(String str) {
        return str.length() == 4;
    }

    
    public static String replaceVowels(String str) {
        
        StringBuilder string2 = new StringBuilder(str);

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            
            if (isVowel(currentChar)) {
                // החלפת האות בכוכבית (*)
                string2.setCharAt(i, '*');
            }
        }

        return string2.toString();
    }

    
    private static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    } */
	
	
	//exe6 function
	/* public static void analyzeNumber(int number) {
       
		// if number is less than 10 than it is a single 
		//digit number, else- it is a double digit number.
        String numberType = (number < 10) ? "single digit number" : "double digit number";
        System.out.println("this number is a " + numberType);


        
        if (number % 3 == 0) {
            System.out.println("The number is divisible by 3");
        } else {
            System.out.println("The number isnt divisible by 3");
        }
    } */

	
}
