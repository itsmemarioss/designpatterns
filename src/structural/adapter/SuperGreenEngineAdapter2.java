package structural.adapter;

import common.Engine;

/**
 * Type: Structural
 * Purpose: Convert the interface of a class into another interface clients expect.
 * Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.
 * 
 * @author mario
 *
 */
public class SuperGreenEngineAdapter2 implements Engine{

	private SuperGreenEngine engine;
	
	public SuperGreenEngineAdapter2(SuperGreenEngine engine) {
		this.engine = engine;
	}

	@Override
	public int getSize() {
		return engine.getEngineSize();
	}

	@Override
	public boolean isTurbo() {
		return false;
	}

	@Override
	public String toString() {
		return engine.toString();
	}
	
	

}
