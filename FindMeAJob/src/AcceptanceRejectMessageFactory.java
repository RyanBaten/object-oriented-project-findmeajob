
public class AcceptanceRejectMessageFactory extends MessageFactoryBase{
	
	private static AcceptanceRejectMessageFactory messageFB=null;
	
	public static AcceptanceRejectMessageFactory getInstance(){
		if (messageFB == null)
		messageFB = new AcceptanceRejectMessageFactory();
		return messageFB;
	}
	
	
	public Message createMessage(String message, int toID, int fromID) {
		//AcceptanceRejectMessage ARMessage= new AcceptanceRejectMessage();
		return null;
		
	}

}
