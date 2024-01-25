package behavioural.chainOfResponsibility;

public class Request {
    private String type;
    private String message;

    public Request(String type, String message) {
        this.type = type;
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public String getMessage() {
        return message;
    }
}
