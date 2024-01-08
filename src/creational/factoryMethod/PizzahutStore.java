package creational.factoryMethod;

// ConcreteCreator
public class PizzahutStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new CheesePizza("피자헛");
        } else if ("pineapple".equals(type)) {
            return new PineapplePizza("피자헛");
        }
        return null;
    }
}
