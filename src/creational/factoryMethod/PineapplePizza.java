package creational.factoryMethod;

// ConcreteProduct
public class PineapplePizza implements Pizza {
    String pizzaStore;

    public PineapplePizza(String pizzaStore) {
        this.pizzaStore = pizzaStore;
    }

    @Override
    public void prepare() {
        System.out.println(pizzaStore + " 파인애플피자 준비");
    }

    @Override
    public void bake() {
        System.out.println(pizzaStore + " 파인애플피자 굽기");
    }

    @Override
    public void box() {
        System.out.println(pizzaStore + " 파인애플피자 포장");
    }
}
