package sturctural.bridge;

// RefinedAbstract
public class Pencil extends Brush {
    public static final String type = "연필";

    public Pencil(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return type + " " + color.fill();
    }
}