package structural.bridge;

import common.Engine;

/**
 * Type: structural
 * Porpose: Decouple an abstraction from its implementation so that each may vary independently.
 * 
 * @author mario
 *
 */
public abstract class AbstractDriverControls {
	
	private Engine engine;
	
	public AbstractDriverControls(Engine engine) {
		super();
		this.engine = engine;
	}
	
	public void ignitionOn() {
		engine.start();
	}
	
	public void ignitionOff() {
		engine.stop();
	}
	
	public void accelerate() {
		engine.increasePower();
	}
	
	public void breake() {
		engine.decreasePower();
	}
}
