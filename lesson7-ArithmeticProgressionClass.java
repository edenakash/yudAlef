
public class ArithmeticProgression {
	private int _firstMember;
	private int _difference;

	
	// creating the constractor.
	public ArithmeticProgression(int fM, int diff) {
		
		_firstMember = fM;
		_difference = diff;
	
	}
	
	public int getFM() {
		return _firstMember;
	}
	
	public int getDiff() {
		return _difference;
	}
	
	public void setFM(int fM) {
		_firstMember = fM;
		
	}
	public void setDiff(int diff) {
		_difference = diff;
	}
	
	public ArithmeticProgression(ArithmeticProgression other) {
		_firstMember = other._firstMember;
		_difference = other._difference;
	}
	
	
	public void printGeneralSeries() {
		System.out.println("an = a1 + d(n-1)");
	}
	
	public int memberCalculation(int n)
	{
		int an= _firstMember + _difference*(n-1);
		return an;
	}
	
	public float calculateN(int an) {
		
			float fM = (float) _firstMember;
			float diff = (float) _difference;
			float n = (an - fM + diff) / diff + 1;
			
			if (n >= 1 && n % 1 == 0) {
				return (int) n;
			}
			else {
				return 0;
			}
	}	
	
	public boolean equal(ArithmeticProgression other) {
		if((_firstMember == other._firstMember) && (_difference == other._difference))
			return true;
		else
			return false;
		
	}
	
	public boolean smallDiff(int diff) {
			return diff < _difference;
		
	}
	//add to arithmetic tester
		

}


