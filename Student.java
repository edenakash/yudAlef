
public class Student {
	
	private String _firstname;
	private String _lastname;
	private long _id;
	private int _year;
	
	public Student(String firstname, String lastname, long id, int year) {
		_firstname = firstname;
		_lastname = lastname;
		_id = id;
		_year = year;
				
		}
	
	public Student(Student other) {
		_firstname = other._firstname;
		_lastname = other._lastname;
		_id = other._id;
		_year = other._year;
	}


	public boolean OverYear1 () {
		return _year >=1 && _year <4;
			
		
	}
}
