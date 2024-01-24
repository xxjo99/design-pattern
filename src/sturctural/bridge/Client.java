package sturctural.bridge;

public class Client {

    public static void main(String[] args) {
        Brush redPen = new Pen(new Red());
        System.out.println(redPen.draw());

        Brush bluePencil = new Pencil(new Blue());
        System.out.println(bluePencil.draw());
    }
}
