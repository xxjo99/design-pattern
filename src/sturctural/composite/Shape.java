package sturctural.composite;

// Component
// leaf, composite간의 공통되는 메서드를 정의
// 도형에 색을 채우는 메서드 정의
public interface Shape {
    public void draw(String paintColor);
}
