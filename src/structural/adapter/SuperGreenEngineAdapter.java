package structural.adapter;

import common.AbstractEngine;


/**
 * Type: Structural
 * Purpose: Convert the interface of a class into another interface clients expect.
 * Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.
 * 
 * @author mario
 *
 */
public class SuperGreenEngineAdapter extends AbstractEngine{

	public SuperGreenEngineAdapter(SuperGreenEngine superGreenEngine) {
		super(superGreenEngine.getEngineSize(), false);
	}

}
