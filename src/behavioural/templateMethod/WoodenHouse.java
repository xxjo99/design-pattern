package behavioural.templateMethod;

// ConcreteClass
public class WoodenHouse extends HouseTemplate {

    @Override
    public void buildWalls() {
        System.out.println("나무벽 추가");
    }

    @Override
    public void buildPillars() {
        System.out.println("나무 기둥 추가");
    }

}
