package behavioural.visitor;

public class VisitorA implements Visitor {
    @Override
    public void visit(Element element) {
        if (element instanceof ElementA) {
            System.out.println("VisitorA : " + element.getClass());
        } else {
            System.out.println("ElementA 객체가 아닙니다.");
        }
    }
}