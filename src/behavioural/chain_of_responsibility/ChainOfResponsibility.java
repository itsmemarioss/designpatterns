package behavioural.chain_of_responsibility;


/**
 * Type: Behavioral
 * 
 * Purpose: Avoid coupling the sender of a request to its receiver by giving more
 * than one object a chance to handle the request. Chain the receiving objects and
 * pass the request along the chain until an object handles it.
 * 
 * @author mario
 *
 */
public class ChainOfResponsibility {

	public static void main(String[] args) {
		AbstractEmailHandler.handle("Email com spam, Do you need pills?");
	}

}
