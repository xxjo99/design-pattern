package creational.factoryMethod;

// 피자를 주문하는 예제
public class Client {

    public static void main(String[] args) {
        PizzaStore pizzahut = new PizzahutStore();
        PizzaStore domino = new DominoPizzaStore();

        Pizza pineapplePizza = pizzahut.orderPizza("pineapple");
        Pizza cheesePizza = pizzahut.orderPizza("cheese");
    }

}
