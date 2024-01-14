
public class PointerExe {
	private int _x;
	private int _y;
	
	// creating the constractor.
	public PointerExe (int x, int y) 
	{
		_x = x;
		_y = y;
		// using this.x = x and this.y = y is also an option.
	}
	
	// enter x and y to move the object.
	public void move (int deltaX, int deltaY)
	{
		_x += deltaX;
		_y += deltaY;
	}
	
	// print the new coordinates.
	public void printStatus() 
	{
		System.out.println("(" + _x + "," + _y + ")")	;
	}
	
	public String toString() {
	    return "(" + _x + "," + _y + ")";
	    
	}


	public int getX() {
		return _x;
	}
	
	public int getY() {
		return _y;
	}
	
	public void setX(int x) {
		_x = x;
	}
	public void setY(int y) {
		 _y = y;
	}
	
	public PointerExe(PointerExe other) { 
		_x = other._x;
		_y = other._y;
	}
	
	//overriding the "equal" function implemented from the "Object" class to our own Desire
	public boolean equal(PointerExe other) {
		if((_x == other._x) && (_y == other._y))
			return true;
		else
			return false;
	}
	
	public double distance(PointerExe p) {
		return Math.sqrt(Math.pow(( _x - p._x), 2) + Math.pow(( _y - p._y), 2));
	}
	

	
}
