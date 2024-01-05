package creational.abstractFactory.concreteFactory;

import creational.abstractFactory.abstractFactory.AbstractFactory;
import creational.abstractFactory.abstractProduct.AbstractProductA;
import creational.abstractFactory.abstractProduct.AbstractProductB;
import creational.abstractFactory.concreteProduct.ConcreteProductA2;
import creational.abstractFactory.concreteProduct.ConcreteProductB2;

// Product A2, B2 를 생성
public class ConcreteFactory2 implements AbstractFactory {

    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB2();
    }
}
