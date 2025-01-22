
public class DemoCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car car = new car("Chevrolet", "Cruze", 2009, 150000.0);
		System.out.println("Company Name: "+ car.getCompanyName());
		System.out.println("Model Name: "+ car.getModelName());
		System.out.println("Year: "+ car.getYear());
		System.out.println("Mileage: "+ car.getMileage());
		
		System.out.println();
		
		System.out.println("Update Car Details:");
		car upcar = new car("Toyota","Corolla",2015,150000.0);
		System.out.println("Company Name: "+ upcar.getCompanyName());
		System.out.println("Model Name: "+ upcar.getModelName());
		System.out.println("Year: "+ upcar.getYear());
		
		upcar.setYear(0);
		upcar.setCompanyName(null);
		
		



	}

}
