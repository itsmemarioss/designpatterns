package structural.decorator;

import common.Vehicle;

public class AirConditionedVehicle extends AbstractVehicleOption {

	public AirConditionedVehicle(Vehicle vehicle) {
		super(vehicle);
	}

	@Override
	public double getPrice() {
		return decoratedVehicle.getPrice() + 600;
	}
	
	public void setTemperature(int value) {
		//code to set the temperature
	}

}
