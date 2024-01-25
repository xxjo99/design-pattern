package behavioural.chainOfResponsibility;

// 요청을 처리
public interface Handler {
    void setNext(Handler handler);
    void handleRequest(Request request);
}