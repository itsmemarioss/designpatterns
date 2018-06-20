package structural.decorator;

import common.Vehicle;

public class MetallicPaintedVehicle extends AbstractVehicleOption {

	public MetallicPaintedVehicle(Vehicle vehicle) {
		super(vehicle);
	}

	@Override
	public double getPrice() {
		return decoratedVehicle.getPrice() +750;
	}

}
