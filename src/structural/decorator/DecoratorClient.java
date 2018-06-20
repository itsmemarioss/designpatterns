package structural.decorator;

import common.BoxVan;
import common.StandartEngine;
import common.Vehicle;
import common.Vehicle.Colour;

public class DecoratorClient {

	public static void main(String[] args) {
		Vehicle van = new BoxVan(new StandartEngine(400));
		van.paint(Colour.BLACK);
		
		System.out.println("Default price:" + van.getPrice());
		
		van = new MetallicPaintedVehicle(van);
		System.out.println("Price with metallic paint:" + van.getPrice());		
		
		van = new AlloyWheeledVehicle(van);
		System.out.println("Price with metallic and alloy wheels:" + van.getPrice());

	}

}
