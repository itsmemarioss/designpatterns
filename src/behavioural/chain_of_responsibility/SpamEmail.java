package behavioural.chain_of_responsibility;

public class SpamEmail extends AbstractEmailHandler {

	@Override
	protected void handleEmailHere(String email) {
		System.out.println("This is email spam!!!");
	}

	@Override
	protected String[] matchingWords() {
		return new String[]{"viagra", "pills", "medicine"};
	}

}
