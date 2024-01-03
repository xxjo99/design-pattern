package sturctural.composite;

import java.util.ArrayList;
import java.util.List;

// Composite
// 복합객체, leaf를 포함
public class Drawing implements Shape {
    private List<Shape> shapes = new ArrayList<>();

    public void add(Shape s) {
        this.shapes.add(s);
    }

    @Override
    public void draw(String paintColor) {
        for (Shape shape : shapes) {
            shape.draw(paintColor);
        }
    }

}
