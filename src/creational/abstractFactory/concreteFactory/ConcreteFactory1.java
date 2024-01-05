package creational.abstractFactory.concreteFactory;

import creational.abstractFactory.abstractFactory.AbstractFactory;
import creational.abstractFactory.abstractProduct.AbstractProductA;
import creational.abstractFactory.abstractProduct.AbstractProductB;
import creational.abstractFactory.concreteProduct.ConcreteProductA1;
import creational.abstractFactory.concreteProduct.ConcreteProductB1;

// Product A1, B1 을 생성
public class ConcreteFactory1 implements AbstractFactory {

    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB1();
    }
}
