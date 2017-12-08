
public class JobApplicationMessageFactory extends MessageFactoryBase {

	private static JobApplicationMessageFactory messageFB=null;
		
	public static JobApplicationMessageFactory getInstance(){
		if (messageFB == null)
		messageFB = new JobApplicationMessageFactory();
		return messageFB;
	}
	
	public Message createMessage(String message, int toID, int fromID) {
		JobApplicationMessage JALMessage=new JobApplicationMessage();
		return JALMessage;
		
	}
}
