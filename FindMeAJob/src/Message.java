
public abstract class Message {
	private int messageId;
	private String rawMessage;
	private int sendUserID;
	private int receiverUserID;
	private Boolean isRead;

	public int getMessageId() {
		return messageId;
	}

	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}

	public String getRawMessage() {
		return rawMessage;
	}

	public void convertRawMessage(String rawMessage) {
		this.rawMessage = rawMessage;
	}

	public int getSendUserID() {
		return sendUserID;
	}

	public void setSendUserID(int sendUserID) {
		this.sendUserID = sendUserID;
	}

	public int getReceiverUserID() {
		return receiverUserID;
	}

	public void setReceiverUserID(int receiverUserID) {
		this.receiverUserID = receiverUserID;
	}

	public Boolean getRead() {
		return isRead;
	}

	public void setRead(Boolean read) {
		isRead = read;
	}
}
