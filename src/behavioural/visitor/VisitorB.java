package behavioural.visitor;

public class VisitorB implements Visitor {
    @Override
    public void visit(Element element) {
        if (element instanceof ElementB) {
            System.out.println("VisitorB : " + element.getClass());
        } else {
            System.out.println("ElementB 객체가 아닙니다.");
        }
    }
}