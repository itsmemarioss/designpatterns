package creational.singleton;



/**
 * Better way to implement a Singleton
 * @author mario
 *
 */
public enum SerialNumberGenerator {
	
	INSTANCE;
	
	private int count;
	
	public synchronized int getNextSerial() {
		return ++count;
	}

}
