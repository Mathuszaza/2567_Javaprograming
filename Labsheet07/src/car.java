
public class car {
	private String companyName;
	private String modelName;
	private int year;
	private double mileage;
	
	car(){
		companyName = "Unknow";
		modelName = "Unknow";
		year = 2000;
		mileage = 0.0;
		//this("Unknow","Unknow",2000,0.0);
	}
	
	car(String companyName,String modelName,int year,double mileage){
		this.companyName = companyName;
		this.modelName = modelName;
		this.year = year <1886? 2000:year;
		this.mileage = mileage;
		
	}
	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		if(companyName != null && !companyName.trim().isEmpty()) {
			this.companyName = companyName;
		}else {
			System.out.println("Error: Invalid company or model name!");
		}
	}
	public String getModelName() {
		return this.modelName;
	}
	public void setModelName(String modelName) {
		if(modelName != null && !modelName.trim().isEmpty()) {
			this.modelName = modelName;
		}else {
			System.out.println("Error: Invalid company or model name!");
		}
	}
	public int getYear() {
		return this.year;
	}
	public void setYear (int year) {
		if(year < 1886) {
			System.out.println("Error: Invalid year!");
		}else {
			this.year = year;
		}
	}
	public double getMileage() {
		return this.mileage;
	}

}
