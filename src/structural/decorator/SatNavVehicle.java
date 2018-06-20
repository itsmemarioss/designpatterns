package structural.decorator;

import common.Vehicle;

public class SatNavVehicle extends AbstractVehicleOption {

	public SatNavVehicle(Vehicle vehicle) {
		super(vehicle);
	}

	@Override
	public double getPrice() {
		return  decoratedVehicle.getPrice() + 1500;
	}

}
