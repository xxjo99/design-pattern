package behavioural.chainOfResponsibility;

public class SecondHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void setNext(Handler handler) {
        nextHandler = handler;
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getType().equals("type1")) {
            System.out.println("두번째 핸들러에 의해 처리: " + request.getMessage());
        } else if (nextHandler != null) { // 다음 핸들러로 처리 전가
            nextHandler.handleRequest(request);
        }
    }
}