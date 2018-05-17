package structural.adapter;

import java.util.ArrayList;
import java.util.List;

import common.Engine;
import common.StandartEngine;
import common.TurboEngine;

public class AdapterClient {

	public static void main(String[] args) {
		
		SuperGreenEngine greenEngine = new SuperGreenEngine(100);
		
		List<Engine> engines = new ArrayList<>();
		engines.add(new StandartEngine(10));
		engines.add(new TurboEngine(20));
		//engines.add(greenEngine));//don't compile
		engines.add(new SuperGreenEngineAdapter(greenEngine));
		engines.add(new SuperGreenEngineAdapter2(greenEngine));
		
		engines.forEach(System.out::println);

	}

}
