package creational.prototype;

import common.BoxVan;
import common.Coupe;
import common.Pickup;
import common.Saloon;
import common.Sport;
import common.StandartEngine;
import common.Vehicle;

/**
 * Prototype.
 * 
 * Purpose: Specify the kinds of object to create using a prototypical instance, 
 * and create new objects by copying the prototype.
 * 
 * @author mario
 *
 */
public class VehicleManager {
	private Vehicle saloon, coupe, sport, boxVan, pickup;

	public VehicleManager() {
		saloon = new Saloon(new StandartEngine(1300));
		coupe = new Coupe(new StandartEngine(1300));
		sport = new Sport(new StandartEngine(1300));
		boxVan = new BoxVan(new StandartEngine(1300));
		pickup = new Pickup(new StandartEngine(1300));
	}

	public Vehicle createSaloon() {
		return (Vehicle) saloon.clone();
	}

	public Vehicle createCoupe() {
		return (Vehicle) coupe.clone();
	}

	public Vehicle createSport() {
		return (Vehicle) sport.clone();
	}

	public Vehicle createBoxVan() {
		return (Vehicle) boxVan.clone();
	}

	public Vehicle createPickup() {
		return (Vehicle) pickup.clone();
	}
	
	public static void main(String[] args) {
		VehicleManager manager = new VehicleManager();
		Vehicle saloon = manager.createSaloon();
	}
	
}
