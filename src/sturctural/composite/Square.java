package sturctural.composite;

// leaf
// 개별 객체, 도형을 정의
public class Square implements Shape {

    @Override
    public void draw(String paintColor) {
        System.out.println("사각형 색칠 : " + paintColor);
    }
}
