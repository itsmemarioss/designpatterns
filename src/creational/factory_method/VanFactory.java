package creational.factory_method;

import common.BoxVan;
import common.Pickup;
import common.StandartEngine;
import common.TurboEngine;
import common.Vehicle;

public class VanFactory extends VehicleFactory {

	@Override
	protected Vehicle selectVehicle(DrivingStyle style) {
		if (style.equals(DrivingStyle.ECONOMICAL) || style.equals(DrivingStyle.MIDRANGE)) {
			return new Pickup(new StandartEngine(2200));
		} else {
			return new BoxVan(new TurboEngine(2500));
		}
	}

}
