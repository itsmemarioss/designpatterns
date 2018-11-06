package creational.abstract_factory;

public class CarFactory extends AbstractVehicleFactory {

	@Override
	public Body createBody() {
		return new CarBody();
	}

	@Override
	public Chassis createChassis() {
		return new CarChassis();
	}

	@Override
	public Windows createWindows() {
		return new CarWindows();
	}

}
