package behavioural.chain_of_responsibility;

public interface EmailHandler {
	void setNextHandler(EmailHandler handler);
	void processHandler(String email);
	
}
