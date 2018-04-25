package common;

public class Saloon extends AbstractCar {

	public Saloon(Engine engine) {
		super(engine, Vehicle.Colour.UNPAINTED);
	}
	
	public Saloon(Engine engine, Colour colour) {
		super(engine, colour);
	}

}
