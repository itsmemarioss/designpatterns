package common;

/**
 * @author mario
 *
 */
public abstract class AbstractEngine implements Engine{
	
	private int size;
	private boolean turbo;
	
	public AbstractEngine(int size, boolean turbo) {
		super();
		this.size = size;
		this.turbo = turbo;
	}

	public int getSize() {
		return size;
	}

	public boolean isTurbo() {
		return turbo;
	}

	@Override
	public String toString() {
		return "AbstractEngine [size=" + size + ", turbo=" + turbo + "]";
	}
	
}
