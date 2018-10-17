package common;

public class EngineDiagnostic implements DiagnosticTool {

	@Override
	public void runDiagnosis(Object o) {
		try {
			Thread.sleep(5000);
			System.out.println("Engine diagnosis complete...");
		} catch (Exception e) {
			System.out.println("Engine diagnosis interrupted...");
		}

	}

}
