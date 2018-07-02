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
	
	@Override
	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		}catch (CloneNotSupportedException  e) {
			// TODO: handle exception
		}
		return obj;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void cleanInterior() {
		System.out.println("cleaning interior...");
	}

	@Override
	public void cleanExteriorBody() {
		System.out.println("cleaning exetrior body...");
	}

	@Override
	public void polishWindows() {
		System.out.println("polishing windows...");
	}

	@Override
	public void takeForTestDrive() {
		System.out.println("takin for test drive...");
	}
	
	

}
