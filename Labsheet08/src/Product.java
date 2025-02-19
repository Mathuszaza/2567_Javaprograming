
public class Product {
	private String productId;
	private int productUnit;
	private double productPrice;
	
	public void setId(String Id) {
		productId = Id;
	}
	public String getId() {
		return productId;
	}
	public void setUnit(int unit) {
		productUnit = unit;
	}
	public int getUnit() {
		return productUnit;
	}
	public void setPrice(double price) {
		productPrice = price;
	}
	public double getPrice() {
		return productPrice;
	}
	public double calculate() {
        return productUnit * productPrice;
    }

}
