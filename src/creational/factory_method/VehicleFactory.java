package creational.factory_method;

import common.Vehicle;

/**
 * Purpose: Define an interface for creating an object, but let subclasses decide which class to instaciate. 
 * @author mario
 *
 */
public abstract class VehicleFactory {
	
	public enum DrivingStyle { ECONOMICAL, MIDRANGE, POWERFUL};
	
	public Vehicle build(DrivingStyle style, Vehicle.Colour colour) {
		Vehicle vehicle = selectVehicle(style);
		vehicle.paint(colour);
		
		return vehicle;
	}
	
	protected abstract Vehicle selectVehicle(DrivingStyle style);

}
