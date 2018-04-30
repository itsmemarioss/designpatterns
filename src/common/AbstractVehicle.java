package common;


public abstract class AbstractVehicle implements Vehicle{
	
	private Engine engine;
	private Vehicle.Colour colour;
	
	public AbstractVehicle(Engine engine) {
		this(engine, Vehicle.Colour.UNPAINTED);
	}

	public AbstractVehicle(Engine engine, Colour colour) {
		super();
		this.engine = engine;
		this.colour = colour;
	}

	public Engine getEngine() {
		return engine;
	}

	public Colour getColour() {
		return colour;
	}

	public void paint(Vehicle.Colour colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName()+ " [engine=" + engine + ", colour=" + colour + "]";
	}

}
