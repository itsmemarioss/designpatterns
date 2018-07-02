package common;

public interface Vehicle extends Cloneable{
	
	public enum Colour {UNPAINTED, BLUE, BLACK, GREEN, RED, SILVER, WHITE, YELLOW};
	
	Engine getEngine();
	Colour getColour();
	void paint(Colour colour);
	double getPrice();
	void cleanInterior();
	void cleanExteriorBody();
	void polishWindows();
	void takeForTestDrive();
	
	Object clone();
	
	

}
