package sturctural.decorator;

// 추가적인 커피의 재료들을 넣기위한 메서드를 정의,
abstract public class Decorator implements Component {
    private Component coffeeComponent;

    public Decorator(Component coffeeComponent) {
        this.coffeeComponent = coffeeComponent;
    }

    @Override
    public String add() {
        return coffeeComponent.add();
    }
}
