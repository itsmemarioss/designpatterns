package creational.factory_method;

import common.Coupe;
import common.Saloon;
import common.Sport;
import common.StandartEngine;
import common.TurboEngine;
import common.Vehicle;

public class CarFactory extends VehicleFactory{

	@Override
	protected Vehicle selectVehicle(DrivingStyle style) {
		switch (style) {
		case ECONOMICAL:
			return new Saloon(new StandartEngine(1300));
		case MIDRANGE:
			return new Coupe(new StandartEngine(1600));
		default:
			return new Sport(new TurboEngine(2000));
		}
	}

	
	
	

}
