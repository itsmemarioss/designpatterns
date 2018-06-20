package common;

public class Coupe extends AbstractCar {

	public Coupe(Engine engine) {
		super(engine, Vehicle.Colour.UNPAINTED);
	}
	
	public Coupe(Engine engine, Colour colour) {
		super(engine, colour);
	}

	@Override
	public double getPrice() {
		return 100.5;
	}

}
