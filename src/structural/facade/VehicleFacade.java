package structural.facade;

import common.Documentation;
import common.Registration;
import common.Vehicle;

/**
 * Type: Strutural
 * 
 * Purpose: Define a unified interface to a set of interfaces in a subsystem.
 * Facade defines a high-level interface that makes the subsystem easier to use.
 * 
 * @author mario
 *
 */
public class VehicleFacade {

	public void prepareForSale(Vehicle vehicle) {
		Registration r = new Registration(vehicle);
		r.allocateLicensePlate();
		r.allocateVehicleNumber();
		
		Documentation.printBrochure(vehicle);
		
		vehicle.cleanInterior();
		vehicle.cleanExteriorBody();
		vehicle.polishWindows();
		vehicle.takeForTestDrive();
	}
}
