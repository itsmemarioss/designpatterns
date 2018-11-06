package behavioural.chain_of_responsibility;

public class GeneralEnquiresEmailHandler extends AbstractEmailHandler {

	@Override
	protected void handleEmailHere(String email) {
		System.out.println("Email handled by general email enquiries...");
	}

	@Override
	protected String[] matchingWords() {
		return new String[0];
	}

}
