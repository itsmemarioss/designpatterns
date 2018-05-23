package structural.bridge;

import common.Engine;
import common.StandartEngine;

public class BridgeClient {

	public static void main(String[] args) {
		Engine engine = new StandartEngine(1300);
		StandardControls controls1 = new StandardControls(engine);
		controls1.ignitionOn();
		controls1.accelerate();
		controls1.ignitionOff();
		
		SportControls controls2 = new SportControls(engine);
		controls2.ignitionOn();
		controls2.accelerate();
		controls2.accelerateHard();
		controls2.ignitionOff();

	}

}
