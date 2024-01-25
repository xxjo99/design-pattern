package behavioural.chainOfResponsibility;

public class ThirdHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void setNext(Handler handler) {
        nextHandler = handler;
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getType().equals("type1")) {
            System.out.println("세번째 핸들러에 의해 처리: " + request.getMessage());
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            // 다음 handler가 없기때문에 처리를 전가하지않음
            System.out.println("처리하지 않음");
        }
    }
}