package sturctural.decorator;

// 커피 제조 예제
public class Client {

    public static void main(String[] args) {
        Component espresso = new ConcreteComponent();
        System.out.println("에스프레소 : " + espresso.add());

        Component americano = new WaterDecorator(new ConcreteComponent());
        System.out.println("아메리카노 : " + americano.add());

        Component latte = new MilkDecorator(new WaterDecorator(new ConcreteComponent()));
        System.out.println("라떼 : " + latte.add());
    }
}
