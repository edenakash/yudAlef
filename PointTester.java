
public class TesterExe {

	public static void main(String[] args) {
		PointerExe p1 = new PointerExe(1,1);
		PointerExe p2 = new PointerExe(3,3);
		
		PointerExe p1a = new PointerExe(p1);
		
		PointerExe p1b = new PointerExe(p1);
		
		
		p1.setX(2);
		p1b.printStatus();
		
		
		p1a.printStatus();
		p1.printStatus();
		
		
		p1.printStatus();
		p1.move(1, 1);
		p1.printStatus();
		if (p2.equal(p1a))
			System.out.println("points are equal");
		else
			System.out.println("points are not equal"); 
	}

}
