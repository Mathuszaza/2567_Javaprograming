
public class Smartphone {
	private String brand;
	private String model;
	private int storageCapacity;
	private int MAX_STORAGE_CAPACITY = 521;
	
	public String getBrand() {
		return this.brand;
	}
	public String getModel() {
		return this.model;
	}
	public int getStorageCapacity() {
		return this.storageCapacity;
	}
	public void setBrand(String brand) {
		if(this.brand.length()<2) {
			System.out.println("Error: Brand must have at least 2 characters!");
		}else {
			this.brand = brand;
		}
	}
	public void setModel(String model) {
		if(this.model.length()<2) {
			System.out.println("Error: Model must have at least 2 characters!");
		}else {
			this.model = model;
		}
	}
	public void setStorageCapacity(int storageCapacity) {
		if(this.storageCapacity) {
			System.out.println("Error: Storage capacity must be between 1 and 512 GB!");
		}else {
			
		}
	}
	public int increaseStorage(int additionalStorage) {
		
	}
	public int getRemainingStorage(int usedStorage) {
		
	}

}
