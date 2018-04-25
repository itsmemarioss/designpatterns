package common;

public interface Vehicle {
	
	public enum Colour {UNPAINTED, BLUE, BLACK, GREEN, RED, SILVER, WHITE, YELLOW};
	
	Engine getEngine();
	Colour getColour();
	void paint(Colour colour);

}
