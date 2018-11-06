package behavioural.chain_of_responsibility;

public class SalesEmailHandler extends AbstractEmailHandler{

	@Override
	protected void handleEmailHere(String email) {
		System.out.println("Email handled by Sales Department");
	}

	@Override
	protected String[] matchingWords() {
		return new String[]{"buy","purchase"};
	}

}
