import java.util.Scanner;
public class Lesson3Exercises {

	public static void main(String[] args) {
		//exe1
		/* Scanner scan = new Scanner(System.in);
		
		System.out.println("enter a number ");
		int num = scan.nextInt();
		
		if(num>0)
			System.out.println("positive number");
		else
			System.out.println("negative number"); */
		
		//exe2
		/* Scanner scan = new Scanner(System.in);
		
		System.out.println("enter a number ");
		int num1 = scan.nextInt();
		System.out.println("enter a number ");
		int num2 = scan.nextInt();
		
		int min = Math.min(num1, num2);
		System.out.println(min); */
		
		// exe3
		/* char name1 = 'A';
		char name2 = 'B';
		
		double dis1 = 100.0;
		double dis2 = 40.5;
		
		int v1 = 60;
		int v2 = 50;
		
		bikeRidingExe3(name1, name2, dis1, dis2, v1, v2); */
		
		//exe4
		/* Scanner scan = new Scanner(System.in);
		int grades = 3;
		double sum = 0;
		for(int i = 0; i<grades; i++) {
			System.out.println("enter a grade ");
			int grade = scan.nextInt();
			sum += grade;
		}
		double avg = sum/ grades;
		System.out.println(avg); */
		
		//exe5
		/* Scanner scan = new Scanner(System.in);
		
		System.out.println("enter a number ");
		int num1 = scan.nextInt();
		System.out.println("enter a number ");
		int num2 = scan.nextInt();
		System.out.println("enter a number ");
		int num3 = scan.nextInt();
		
		int min = Math.min(Math.min(num2, num3), num1);
		System.out.println(min); */
		
		//exe6
		/* Scanner scan = new Scanner(System.in);
		
		System.out.println("enter a number ");
		double x1 = scan.nextDouble();
		System.out.println("enter a number ");
		double x2 = scan.nextDouble();
		System.out.println("enter a number ");
		double y1 = scan.nextDouble();
		System.out.println("enter a number ");
		double y2 = scan.nextDouble();
		
		double distance = Math.sqrt(Math.pow((x1-x2),2) +Math.pow(y1-y2,2));
		
		System.out.println(distance); */
		
		//exe7
		/* Scanner scan = new Scanner(System.in);
		System.out.print("enter first term ");
		int firstTerm = scan.nextInt();
	
		        
		System.out.print("enter difference ");
		int difference = scan.nextInt();
	
		        
		int fifthTerm = firstTerm + 4 * difference;
		int tenthTerm = firstTerm + 9 * difference;
	
		System.out.println("fifth term is " + fifthTerm);
		System.out.println("tenth term is " + tenthTerm); */
	
		//exe8
		/* Scanner scan = new Scan(System.in);

      
        System.out.print("enter the amount of ice creams ");
        int numOfIceCreams = scan.nextInt();

        calculateMinPrice(numOfIceCreams); */
		
		//exe9
		/* Scanner scan = new Scanner(System.in);
		
		System.out.println("enter your name and last name ");
		String fullName = scan.nextLine();
		System.out.println("enter your school's name  ");
		String schoolName = scan.nextLine();
		System.out.println("enter the amount of subjects you study ");
		int subjects = scan.nextInt();
		
		System.out.println("My name is  " + fullName + ". My school is " + schoolName +
		 ". The number of subjects I study is " + subjects); */
		
		
		//exe10 
		/* Scanner scan = new Scanner(System.in);
		System.out.println("enter number ");
		int num = scan.nextInt();
		if(num >=100 && num <=999 ) {
			int digit1 = num / 100; 
            int digit2 = (num / 10) % 10; 
            int digit3 = num % 10; 
            int sum = digit1 + digit2 + digit3;
            
            System.out.println(sum);	
		}
		else
			System.out.println("Unavailable "); */
		
	}
	
	//exe3 function
	/* public static void bikeRidingExe3 (char name1, char name2, double dis1, double dis2, int v1, int v2) {
		
		double time1 = dis1/v1;
		double time2 = dis2/v2;
		
		double first = Math.min(time1, time2);
		
		if (first == time1)
			System.out.println(name1 + " rode the bike for less time than " + name2);
		else if (first == time2)
			System.out.println(name2 + " rode the bike for less time than " + name1);
		else if (first == time1 && first == time2)
			System.out.println(name1 + " and " + name2 + " rode the bike the same amount of time");
		
	} */
	
	//exe8 function
	/* private static void calculateMinPrice(int numOfIceCreams) {
        double pricePerIceCream = 1.1;
        double	totalPrice = 0;
        if (numOfIceCreams == 10) 
            totalPrice = 10;
        else if (numOfIceCreams == 54) 
            totalPrice = 50; 
        else if (numOfIceCreams == 108) 
            totalPrice = 100; 
        
        else if (numOfIceCreams > 10 && numOfIceCreams < 54) 
        	totalPrice = numOfIceCreams * pricePerIceCream;
        else if (numOfIceCreams > 54 && numOfIceCreams < 108) 
        	totalPrice = numOfIceCreams * pricePerIceCream;
        
        System.out.println(totalPrice);

        
        if (numOfIceCreams > 108) 
        	System.out.println("Unavailable ");
       
    } */
	

}
