package creational.abstractfactory;

public class AbstractVehicleFactoryClient {
	public static void main(String[] args) {
		String whatToMake="C";
		AbstractVehicleFactory factory = null;
		
		if(whatToMake.equals("C")) {
			factory = new CarFactory();
		}else {
			factory = new VanFactory();
		}
		
		Body body= factory.createBody();
		Chassis chassis = factory.createChassis();
		Windows windows = factory.createWindows();
		
		System.out.println(body.getBodyParts());
		System.out.println(chassis.getChassisParts());
		System.out.println(windows.getWindowsParts());
	}
}
