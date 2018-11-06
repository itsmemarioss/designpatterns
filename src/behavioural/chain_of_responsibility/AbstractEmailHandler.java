package behavioural.chain_of_responsibility;

public abstract class AbstractEmailHandler implements EmailHandler {

	private EmailHandler next;
	
	public void setNextHandler(EmailHandler handler) {
		next = handler;
	}

	public void processHandler(String email) {
		boolean wordFound = false;
		if(matchingWords().length == 0){
			wordFound = true;
		}else{
			for (String word : matchingWords()) {
				if(email.indexOf(word)>0){
					wordFound = true;
					break;
				}
			}
		}
		
		if(wordFound){
			handleEmailHere(email);
		}else{
			next.processHandler(email);
		}
		
	}

	protected abstract void handleEmailHere(String email);

	protected abstract String[] matchingWords();
	
	public static void handle(String email){
		EmailHandler spamHandler = new SpamEmail();
		EmailHandler salesHandler = new SalesEmailHandler();
		EmailHandler generalHandler = new GeneralEnquiresEmailHandler();
		
		spamHandler.setNextHandler(salesHandler);
		salesHandler.setNextHandler(generalHandler);
		
		spamHandler.processHandler(email);
	}

}
