package sturctural.composite;

import java.util.ArrayList;
import java.util.List;

// 도형을 생성하고 도형의 색을 칠하는 예제
public class Client {

    public static void main(String[] args) {
        Shape triangle = new Triangle();
        Shape circle = new Circle();
        Shape square = new Square();

        Drawing drawing = new Drawing();
        drawing.add(triangle);
        drawing.add(circle);
        drawing.add(square);

        drawing.draw("빨간색");

        List<Shape> shapes = new ArrayList<>();
        shapes.add(drawing);
        shapes.add(new Triangle());
        shapes.add(new Circle());

        for(Shape shape : shapes) {
            shape.draw("초록색");
        }
    }

}
