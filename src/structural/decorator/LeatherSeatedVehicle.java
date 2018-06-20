package structural.decorator;

import common.Vehicle;

public class LeatherSeatedVehicle extends AbstractVehicleOption {

	public LeatherSeatedVehicle(Vehicle vehicle) {
		super(vehicle);
	}

	@Override
	public double getPrice() {
		return  decoratedVehicle.getPrice() +1200;
	}

}
