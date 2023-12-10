import java.util.Scanner;
public class Lesson5Exercises { 

	public static void main(String[] args) {
		
		Lesson5Exercises myFunctions = new Lesson5Exercises();
		Scanner scan = new Scanner(System.in);
		
		//function calling for exe1
        //myFunctions.helloStudent(); 

        
        //function calling for exe2
        /* System.out.print("Enter a number ");
        int num = scan.nextInt();
         
        myFunctions.MultiplesOfFive(num); */
        
		//function calling for exe3
        /* System.out.print("Enter a number ");
        int userNumber = scan.nextInt(); 

        System.out.print("Enter another number ");
        int userNumber1 = scan.nextInt();

        System.out.println("Product of the two numbers: " + myFunctions.multiplyNumbers(userNumber, userNumber1));
		*/
		
		//function calling for exe4
        /* System.out.print("Enter three numbers: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        myFunctions.calculateSumAndAverage(num1, num2, num3); */

		//function calling for exe5
        /* System.out.print("Enter the radius of a circle: ");
        double radius = scan.nextDouble();

        myFunctions.calculateCircle(radius); */
        
		//function calling for exe6
        /* System.out.print("Enter the lengths of two sides of a right-angled triangle: ");
        double sideA = scan.nextDouble();
        double sideB = scan.nextDouble();

        System.out.println("Hypotenuse length: " + myFunctions.calculateTriangle(sideA, sideB)); */
        
        //function calling for exe7
        /* System.out.print("Enter three letters: ");
        String userLetters = scan.nextLine();

        myFunctions.reverseLetters(userLetters); */
        
        
		//function calling for exe8
        /* System.out.print("Enter the first term, common difference, and term number of an arithmetic series: ");
        int firstTerm = scan.nextInt();
        int commonDifference = scan.nextInt();
        int termNumber = scan.nextInt();

        
        System.out.println("Arithmetic series term: " + myFunctions.calculateArithmeticSeries(firstTerm, commonDifference, termNumber));
        */
    }
	
	 

	
		//exe1
	    /* public void helloStudent() {
	        Scanner scan = new Scanner(System.in);

	        System.out.print("Enter student's name: ");
	        String studentName = scan.nextLine();

	        System.out.println("Hello, " + studentName + "!"); 
	    } */

	    
		//exe2
	    /* public void MultiplesOfFive(int number) {
	        System.out.println("Numbers divisible by 5: ");
	        for (int i = 1; i <= number; i++) {
	            if (i % 5 == 0) {
	                System.out.print(i + " ");
	            }
	        }
	        System.out.println();  
	    } */

	    //exe3
	    /* public int multiplyNumbers(int num1, int num2) {
	        return num1 * num2; 
	    } */

	    //exe4
	    /* public void calculateSumAndAverage(int num1, int num2, int num3) {
	        int sum = num1 + num2 + num3;
	        double average = sum / 3.0;  

	        System.out.println("Sum: " + sum);
	        System.out.println("Average: " + average);
	    } */

	    //exe5
	    /* public void calculateCircle(double radius) {
	        double circumference = 2 * Math.PI * radius;
	        double area = Math.PI * Math.pow(radius, 2);

	        System.out.println("Circumference: " + circumference);
	        System.out.println("Area: " + area);
	    } */

	    //exe6
	    /* public double calculateTriangle(double sideA, double sideB) {
	        return Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
	    } */

	    //exe7
		/* public void reverseLetters(String letters) {
		    StringBuilder reversed = new StringBuilder(letters);
		    reversed.reverse();
	
		    System.out.println(reversed);
	    } */

	    //exe8
	    /* public int calculateArithmeticSeries(int firstTerm, int commonDifference, int termNumber) {
	        return firstTerm + (termNumber - 1) * commonDifference; 
	    } */

}	
