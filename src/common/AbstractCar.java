package common;

public class AbstractCar extends AbstractVehicle {

	public AbstractCar(Engine engine) {
		super(engine);
	}

	public AbstractCar(Engine engine, Vehicle.Colour colour) {
		super(engine, colour);
	}
	

}
