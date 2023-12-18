
public class ArithmeticTester {

	public static void main(String[] args)
    {
        ArithmeticProgression myFunctions = new ArithmeticProgression(1, 1);


        
        myFunctions.printGeneralSeries();
        int result1 = myFunctions.memberCalculation(11);
        float result2 = myFunctions.calculateN(5);
        
        System.out.println("Last member in this Progression: " + result1);
        System.out.println("Value of member: " + result2);
        
        // add 7,8,9 from arithmeticClass
        myFunctions.setFM(5);
        myFunctions.setDiff(2);
        
        System.out.println("New first member: " + myFunctions.getFM());
        System.out.println("New difference: " + myFunctions.getDiff());
        
        ArithmeticProgression otherProgression = new ArithmeticProgression(myFunctions);
        
        System.out.println("Are progressions equal? " + myFunctions.equal(otherProgression));
        
        int diffToCompare = 5;
        System.out.println("Is the difference smaller than " + diffToCompare + "? " + myFunctions.smallDiff(diffToCompare));
    
       
        
    }

	}
