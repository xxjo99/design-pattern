package sturctural.flyweight;

// 설정된 색과 크기를 통해 원을 그리는 예제
public class Client {

    public static void main(String[] args) {
        String[] colors = {"Red","Green","Blue","Yellow"};

        for (int i = 0; i < 10; i++) {
            Circle circle = (Circle)ShapeFactory.getCircle(colors[(int) (Math.random()*4)]);
            circle.setX((int) (Math.random()*100));
            circle.setY((int) (Math.random()*4));
            circle.setRadius((int) (Math.random()*10));
            circle.draw();
        }
    }
}
