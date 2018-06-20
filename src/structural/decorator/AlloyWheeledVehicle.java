package structural.decorator;

import common.Vehicle;

public class AlloyWheeledVehicle extends AbstractVehicleOption {

	public AlloyWheeledVehicle(Vehicle vehicle) {
		super(vehicle);
	}

	@Override
	public double getPrice() {
		return decoratedVehicle.getPrice() + 250;
	}

}
