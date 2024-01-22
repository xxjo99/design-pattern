package behavioural.visitor;

public class Client {
    public static void main(String[] args) {
        Element elementA = new ElementA();
        elementA.accept(new VisitorA());

        Element elementB = new ElementB();
        elementB.accept(new VisitorB());

        elementA.accept(new VisitorB());
        elementB.accept(new VisitorA());
    }
}