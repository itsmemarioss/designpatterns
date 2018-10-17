package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

import common.Engine;
import common.EngineDiagnostic;
import common.StandartEngine;
import common.TurboEngine;

/**
 * Type: Structural
 * 
 * Purpose: Use sharing to support large numbers of fine-granted objects efficiently.
 * 
 * @author mario
 *
 */
public class EngineFlyweightFactory {
	
	Map<Integer, Engine> standartEnginePool;
	Map<Integer, Engine> turboEnginePool;
	
	public EngineFlyweightFactory() {
		standartEnginePool = new HashMap<>();
		turboEnginePool = new HashMap<>();
	}
	
	public Engine getStandartEngine(int size) {		
		standartEnginePool.computeIfAbsent(size, StandartEngine::new);
		return standartEnginePool.get(size);
	}
	
	public Engine getTurboEngine(int size) {
		turboEnginePool.computeIfAbsent(size, TurboEngine::new);
		return null;
	}
	
	
	public static void main(String[] args) {
		EngineFlyweightFactory factory = new EngineFlyweightFactory();
		
		Engine standart1 = factory.getStandartEngine(1300);
		Engine standart2 = factory.getStandartEngine(1300);
		
		standart1.diagnose(new EngineDiagnostic());
		standart2.diagnose(new EngineDiagnostic());
	}

}
