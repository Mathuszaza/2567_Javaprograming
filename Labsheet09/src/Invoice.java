
public class Invoice {
	private int invId;
	private Customer customer;
	private double amount;
	
	Invoice(int id,Customer customer,double amount){
		this.invId = invId;
		this.customer = customer;
		this.amount = amount;
	}
	
	public int getInvoiceId() {
		return this.invId;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public double getAmount() {
		return this.amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Customer getCustomer() {
		return this.customer;
	}
	public int getCustomerId() {
		return this.getCustomer().getId();
	}
	public String getCustomerName() {
		return this.getCustomer().getName();
	}
	public int getCustomerDiscount() {
		return this.getCustomer().getDiscount();
	}
	public double getAmountAfterDiscount() {
		return this.getAmount() - (this.getAmount()*this.getCustomerDiscount()/100);
	}
	public String toString() {
		return "Invoice[id= "+this.getInvoiceId()+",customer="+customer.toString()+",count="+this.getAmountAfterDiscount()+"]";
	}

}