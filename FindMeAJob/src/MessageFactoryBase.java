
public abstract class MessageFactoryBase {

	public MessageFactoryBase() {}

	public abstract Message createMessage(String message, int toID, int fromID); 
}

