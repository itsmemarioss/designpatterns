package common;

public class Registration {
	private Vehicle vehicle;

	public Registration(Vehicle vehicle) {
		super();
		this.vehicle = vehicle;
	}
	
	public void allocateLicensePlate() {
		System.out.println("License plate allocated");
	}
	
	public void allocateVehicleNumber() {
		System.out.println("Vehicle number allocated");
	}
}
