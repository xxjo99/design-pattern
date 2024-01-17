package behavioural.templateMethod;

// AbstractClass
public abstract class HouseTemplate {

    // final로 재정의 방지
    public final void buildHouse(){
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("집 완성.");
    }

    // 기본으로 사용할 메서드
    private void buildWindows() {
        System.out.println("창문 추가");
    }

    // 하위 클래스에서 직접 구현
    public abstract void buildWalls();
    public abstract void buildPillars();
}