
public class Product {
	private String productId;
	private int productUnit;
	private double productPrice;
	
	public void setProductId(String Id) {
		productId = Id;
	}
	public String getProductId() {
		return productId;
	}
	public void setproductUnit(int unit) {
		productUnit = unit;
	}
	public int getproductUnit() {
		return productUnit;
	}
	public void setproductPrice(double price) {
		productPrice = price;
	}
	public double getproductPrice() {
		return productPrice;
	}
	public double calculate() {
        return productUnit * productPrice;
    }

}
