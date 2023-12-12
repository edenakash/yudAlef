public class ArithmeticProgression {
	private int _firstMember;
	private int _difference;

	
	// creating the constractor.
	public ArithmeticProgression(int fM, int diff) {
		
		_firstMember = fM;
		_difference = diff;
	
	}
	public void printGeneralSeries() {
		System.out.println("an = "+_firstMember + _difference + "(n-1)");
	}
	
	public int memberCalculation(int n)
	{
		int an= _firstMember + (_difference*n - _difference);
		return an;
	}
	
	public float calculateN(int an) {
		
			float fM = (float) _firstMember;
			float diff = (float) _difference;
			float n = (an - fM + diff) / diff + 1;
			
			if (n >= 1 && n % 1 == 0) {
				return (int) n - 1;
			}
			else {
				return 0;
			}
		
	}

  
}
