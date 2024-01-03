package sturctural.composite;

// leaf
// 개별 객체, 도형을 정의
public class Circle implements Shape {

    @Override
    public void draw(String paintColor) {
        System.out.println("원 색칠 : " + paintColor);
    }
}
