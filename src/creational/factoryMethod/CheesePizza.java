package creational.factoryMethod;

// ConcreteProduct
public class CheesePizza implements Pizza {
    String pizzaStore;

    public CheesePizza(String pizzaStore) {
        this.pizzaStore = pizzaStore;
    }

    @Override
    public void prepare() {
        System.out.println(pizzaStore + " 치즈피자 준비");
    }

    @Override
    public void bake() {
        System.out.println(pizzaStore + " 치즈피자 굽기");
    }

    @Override
    public void box() {
        System.out.println(pizzaStore + " 치즈피자 포장");
    }
}
