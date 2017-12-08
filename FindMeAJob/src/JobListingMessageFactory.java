
public class JobListingMessageFactory extends MessageFactoryBase{

	private static JobListingMessageFactory messageFB=null;
	
	public static JobListingMessageFactory getInstance(){
		if (messageFB == null)
		messageFB = new JobListingMessageFactory();
		return messageFB;
	}
	
	public Message createMessage(String message, int toID, int fromID) {
		JobListingMessage JLMessage = new JobListingMessage();
		return JLMessage;
		
	}
}
