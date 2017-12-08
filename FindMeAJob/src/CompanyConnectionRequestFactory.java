
public class CompanyConnectionRequestFactory  extends MessageFactoryBase{

	private static CompanyConnectionRequestFactory messageFB=null;
	
	public static CompanyConnectionRequestFactory getInstance(){
		if (messageFB == null)
		messageFB = new CompanyConnectionRequestFactory();
		return messageFB;
	}
	
	public Message createMessage(String message, int toID, int fromID) {
		//CompanyConnectionRequest CCMessage=new CompanyConnectionRequest();
		return null;
		
	}
}
