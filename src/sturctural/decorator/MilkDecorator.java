package sturctural.decorator;

// 추가적인 재료인 우유을 추가하기 위해 Decorator를 상속받아 구현
public class MilkDecorator extends Decorator {
    public MilkDecorator(Component coffeeComponent) {
        super(coffeeComponent);
    }

    @Override
    public String add() {
        return super.add() + " + 물";
    }
}