package common;

public class Pickup extends AbstractVan {

	public Pickup(Engine engine) {
		super(engine, Vehicle.Colour.UNPAINTED);
	}
	
	public Pickup(Engine engine, Colour colour) {
		super(engine, colour);
		// TODO Auto-generated constructor stub
	}

}
