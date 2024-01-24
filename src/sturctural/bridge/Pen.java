package sturctural.bridge;

// RefinedAbstract
public class Pen extends Brush {
    public static final String type = "펜";

    public Pen(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return type + " " + color.fill();
    }
}