package FindMeAJob;

public class JobListingMessage extends Message {
    private String message;

    public String getMessage(){
        return this.message;
    }

    public void setMessage(String message){
        this.message = message;
    }
}