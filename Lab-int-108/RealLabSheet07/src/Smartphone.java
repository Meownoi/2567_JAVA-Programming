
public class Smartphone {
	
	private String brand;
	private String model;
	private int storageCapacity;
	private static final int MAX_STORAGE_CAPACITY = 512;
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		if(brand == null || brand.length() < 2) {
			System.out.println("Error! : Brand must have at least 2 characters!");
		}else {
			this.brand = brand;
		}
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		if(model == null || model.length() < 2) {
			System.out.println("Error! : Model must have at least 2 characters!");
		}else {
			this.model = model;
		}
	}
	
	public int getStorageCapacity() {
		return storageCapacity;
	}
	
	public void setStorageCapacity(int storageCapacity) {
		if(storageCapacity <1 || storageCapacity>MAX_STORAGE_CAPACITY) {
			System.out.println("Error! : storageCapacity must be between 1 and 512 GB!");
		}else {
			this.storageCapacity = storageCapacity;
		}
	}
	
	public void increaseStorage(int additionalStorage) {
		if(additionalStorage <=0) {
			System.out.println("Error: Additional storage must be positive!");
		}else if(storageCapacity + additionalStorage > MAX_STORAGE_CAPACITY) {
			System.out.println("Error: Storage capacity cannot exeed"+ MAX_STORAGE_CAPACITY + " GB!");
		}else {
			storageCapacity += additionalStorage;
		}
	}
	
	
	public int getRemainingStorage(int usedStorage) {
		if(usedStorage < 0 || usedStorage > storageCapacity) {
			System.out.println("Error: Used storage must be between 0 and " + storageCapacity + " GB!");
			return -1;
		}
		return storageCapacity - usedStorage;
	}
	
	
	public void displayDetails() {
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Storage Capacity: "+storageCapacity + " GB!");
	}
}
