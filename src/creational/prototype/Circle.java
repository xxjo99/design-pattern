package creational.prototype;

// ConcretePrototype
public class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("원 그리기");
    }
}
