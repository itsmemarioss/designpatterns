package structural.decorator;

import common.AbstractVehicle;
import common.Vehicle;

/**
 * Type: Structural
 * 
 * Purpose: Attach additional responsibilities to an object dynamically. 
 * Decorators provide a flexible alternative to subclassing for extending functionality.
 * 
 * @author mario
 *
 */
public abstract class AbstractVehicleOption extends AbstractVehicle {
	
	protected Vehicle decoratedVehicle;

	public AbstractVehicleOption(Vehicle vehicle) {
		super(vehicle.getEngine());
		this.decoratedVehicle = vehicle;
	}

}
