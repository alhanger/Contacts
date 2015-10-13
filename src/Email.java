/**
 * Created by alhanger on 10/8/15.
 */
public class Email {
    public String subject;
    public String body;
    public String sendTo;
    public int timeStamp;

    public Email() {
        System.out.println("Creating email...");
        subject = "No Subject";
        body = "";
        sendTo = "";
        timeStamp = 0;
    }

    public Email(String subject, String body, String sendTo, int timeStamp){
        this.subject = subject;
        this.body = body;
        this.sendTo = sendTo;
        this.timeStamp = timeStamp;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setBody(String bodyText) {
        body = bodyText;
    }

    public void setSendTo(String destination) {
        sendTo = destination;
    }

    public String getSubject(){
        return subject;
    }

    public String getBody() {
        return body;
    }

    public String getSendTo() {
        return sendTo;
    }

    public void setTimeStamp(int newTimeStamp) {
        timeStamp = newTimeStamp;
    }

    public int getTimeStamp() {
        return timeStamp;
    }

    public static boolean isValidSubject(String subject) {
        return subject.length() != 0;
    }

}
