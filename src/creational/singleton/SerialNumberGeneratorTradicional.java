package creational.singleton;


/**
 * Purpose: Ensure a class allows only one object to be created, 
 * providing a single point of access to it.
 * 
 * @author mario
 *
 */
public class SerialNumberGeneratorTradicional {
	
	private static SerialNumberGeneratorTradicional instance;
	
	private int count;
	
	private SerialNumberGeneratorTradicional() {}
	
	public synchronized static SerialNumberGeneratorTradicional getInstance() {
		if(instance == null) {
			instance = new SerialNumberGeneratorTradicional();
		}
		return instance;
	}
	
	public synchronized int getNextSerial() {
		return ++count;
	}

}
