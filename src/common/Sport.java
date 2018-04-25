package common;

public class Sport extends AbstractCar {

	public Sport(Engine engine) {
		super(engine, Vehicle.Colour.UNPAINTED);
	}
	
	public Sport(Engine engine, Colour colour) {
		super(engine, colour);
	}

}
