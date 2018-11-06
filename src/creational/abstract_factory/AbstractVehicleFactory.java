package creational.abstract_factory;


/**
 * Porpose: Provides an interface for creating families of related objects or dependent objects 
 * without specifying their concrete classes.
 * 
 * @author mario
 *
 */
public abstract class AbstractVehicleFactory {
	public abstract Body createBody();
	public abstract Chassis createChassis();
	public abstract Windows createWindows();
}
