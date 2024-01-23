package creational.prototype;

public class Client {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = ShapeCache.getShape("1");
        System.out.println("도형 : " + clonedShape.getType());
        clonedShape.draw();

        Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("도형 : " + clonedShape2.getType());
        clonedShape2.draw();
    }
    
}
