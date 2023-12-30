
public class Circle {
	private double _radius;
	private PointerExe _center;
	
	// creating the constractor.
		public Circle (int x, int y, double radius) 
		{

			_radius = radius;
			//לייצר אובייקט חדש עם הערכים של איקס + וואי ולהכניס אותם לתוך סנטר שטיפוסו פוינטר ומקבל שני ערכים מהמחלקה פוינטר 
			_center = new PointerExe (x,y); 
			/////////////////////////////// 
			// using this.x = x and this.y = y is also an option.
		}
		public Circle (PointerExe center, double radius) 
		{
			_radius = radius;
			_center = center;
			
		}
		
		public Circle (Circle other) 
		{
			_radius = other._radius;
			_center = other._center;
			
		}
}
