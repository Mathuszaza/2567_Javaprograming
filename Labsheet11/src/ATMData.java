
public class ATMData {
	private String accountNumber;
	private String password;
	
	public void ATMData(String id,String pass) {
		this.accountNumber = id;
		this.password = pass;
	}
	
	public String getID() {
		return this.accountNumber;
	}
	
	public String getPass() {
		return this.password;
	}
}
