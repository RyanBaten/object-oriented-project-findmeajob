
public class AcceptanceRejectMessageFactory extends MessageFactoryBase{
	
	private static AcceptanceRejectMessageFactory messageFB=null;
	
	public static AcceptanceRejectMessageFactory getInstance(){
		if (messageFB == null)
		messageFB = new AcceptanceRejectMessageFactory();
		return messageFB;
	}
	
	
	public Message createMessage() {
		//AcceptanceRejectMessage ARMessage= new AcceptanceRejectMessage();
		return null;
		
	}

}
