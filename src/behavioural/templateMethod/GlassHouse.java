package behavioural.templateMethod;

// ConcreteClass
public class GlassHouse extends HouseTemplate {

    @Override
    public void buildWalls() {
        System.out.println("유리벽 추가");
    }

    @Override
    public void buildPillars() {
        System.out.println("유리 기둥 추가");
    }

}
