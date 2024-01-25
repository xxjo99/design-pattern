package behavioural.chainOfResponsibility;

public class Client {

    public static void main(String[] args) {
        Handler firstHandler = new FirstHandler();
        Handler secondHandler = new SecondHandler();
        Handler thirdHandler = new ThirdHandler();

        firstHandler.setNext(secondHandler);
        secondHandler.setNext(thirdHandler);

        Request request1 = new Request("type1", "Request 1");
        Request request2 = new Request("type2", "Request 2");
        Request request3 = new Request("type3", "Request 3");
        Request request4 = new Request("type4", "Request 4");

        firstHandler.handleRequest(request1);
        firstHandler.handleRequest(request2);
        firstHandler.handleRequest(request3);
        firstHandler.handleRequest(request4);
    }

}
