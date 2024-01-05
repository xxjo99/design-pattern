package creational.abstractFactory.abstractFactory;

import creational.abstractFactory.abstractProduct.AbstractProductA;
import creational.abstractFactory.abstractProduct.AbstractProductB;

public interface AbstractFactory {
    AbstractProductA createProductA();
    AbstractProductB createProductB();
}
