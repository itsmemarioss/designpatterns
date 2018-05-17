package structural.adapter;

/**
 * Class that represents a third part component that need to be adapted.
 * 
 * @author mario
 *
 */
public class SuperGreenEngine {
	
	private int size;
	
	public SuperGreenEngine(int size) {
		super();
		this.size = size;
	}

	public int getEngineSize() {
		return size;
	}

	@Override
	public String toString() {
		return "SuperGreenEngine [size=" + size + "]";
	}

}
