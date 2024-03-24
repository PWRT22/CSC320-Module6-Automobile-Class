package automobileClass;

public class automobile {
	//Variables that contain a car information.
	private String make;
	private String model;
	private String color;
	private int year;
	private int mileage;
	private String vinNumber;
	
	//Method to Print on the display the car information.
	public void printCarInformation() {
		System.out.println("Car Make: " + make);
		System.out.println("Car Model: " + model);
		System.out.println("Car Color: " + color);
		System.out.println("Car Mileage: " + mileage);
		System.out.println("Car Vin Number: " + vinNumber);
	}
	

	// Creating a constructor for the car information.
	public automobile(String make, String model, String color, int year, int mileage, String vinNumber) {
		this.make = make;
		this.model = model;
		this.color = color;
		this.year = year;
		this.mileage = mileage;
		this.vinNumber = vinNumber;
	}
	
	//Method to remove a car information if information matches existing car information.
	public String carRemoval(String carMake, String carModel, String carColor, int carYear, int carMileage, String carVinNumber) {
		if(carMake.equals(make) && carModel.equals(model) && carColor.equals(color) && carYear == year && carMileage == mileage && carVinNumber.equals(vinNumber)) {
			make = null;
			model = null;
			color = null;
			year = 0;
			mileage = 0;
			vinNumber = null;
			return "Car has been removed";
		}
		else {
			return "Car information does not exist. Unable to retrieve for removal.";
		}
	}
	
	//Method to add a new car to the inventory
	public String addNewCar(String newCarMake, String newCarModel, String newCarColor, int newCarYear, int newCarMileage, String newCarVinNumber) {
			make = newCarMake;
			model = newCarModel;
			color = newCarColor;
			year = newCarYear;
			mileage = newCarMileage;
			vinNumber = newCarVinNumber;
			
			return "Car added to inventory successfully";
	}
	

}




