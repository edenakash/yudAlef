
public class Snack {
	
	private String _name;
	private double _price;
	
	public Snack (String name, double price) {
		_name = name;
		_price = price;
	}
	
	public String getSnackNAme() {
		return _name;
	}
	
	public Double getSnackPrice() {
		return _price;
	}
	
	public void setSnackName(String snackName) {
		_name = snackName;
		
	}
	public void setSnackPrice(int SnackPrice) {
		_price = SnackPrice;
	}
	
}
