
public class Product {
	private String name;
	private double price;
	private double vatRate;
	
	public void setProductDetails(String Name, double Price, double VatRate) {
		name = Name;
		price = Price;
		vatRate = VatRate;
	}
	public double calculateTotalPrice() {
		double priceVat = price + (price * (vatRate/100));
		return priceVat;	
	}
	public void displayProductDetails() {
		System.out.println("Product Name: "+ name);
		System.out.println("Price (Before VAT): "+ price);
		System.out.println("Price (After VAT): "+ calculateTotalPrice());
	}
}

