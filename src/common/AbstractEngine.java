package common;

/**
 * @author mario
 *
 */
public abstract class AbstractEngine implements Engine{
	
	private int size;
	private boolean turbo;
	private boolean running;
	private int power;
	
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
	
	@Override
	public void decreasePower() {
		if(running && (power > 10) ) {
			power--;
			System.out.println("Engine power dencreased to "+power);
		}
		
	}
	
	@Override
	public void start() {
		running = true;
		System.out.println("Engine started!");
		
	}
	
	@Override
	public void stop() {
		running = false;
		System.out.println("Engine stoped!");
		
	}
	
	@Override
	public void increasePower() {
		if(running && (power < 10) ) {
			power++;
			System.out.println("Engine power increased to "+power);
		}
		
	}
	@Override
	public void diagnose(DiagnosticTool tool) {
		tool.runDiagnosis(this);		
	}
}
