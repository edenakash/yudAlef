public class ArithmeticTester {

	public static void main(String[] args)
    {
        ArithmeticProgression myFunctions = new ArithmeticProgression(2, 2);



        myFunctions.printGeneralSeries();
        int result1 = myFunctions.memberCalculation(4);
        float result2 = myFunctions.calculateN(4);
        
        System.out.println("RESULT 1 = " + result1);
        System.out.println("RESULT 2 = " + result2);


    }

}
