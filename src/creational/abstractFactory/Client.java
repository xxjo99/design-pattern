package creational.abstractFactory;

import creational.abstractFactory.abstractFactory.AbstractFactory;
import creational.abstractFactory.abstractProduct.AbstractProductA;
import creational.abstractFactory.concreteFactory.ConcreteFactory1;
import creational.abstractFactory.concreteFactory.ConcreteFactory2;

class Client {
    public static void main(String[] args) {
        AbstractFactory factory = null;

        // factory1 생성
        factory = new ConcreteFactory1();

        // factory1을 통해 객체군 A1 생성
        AbstractProductA product_A1 = factory.createProductA();
        System.out.println(product_A1.getClass().getName());

        // factory2 생성
        factory = new ConcreteFactory2();

        // factory2를 통해 객체군 A2 생성
        AbstractProductA product_A2 = factory.createProductA();
        System.out.println(product_A2.getClass().getName());
    }
}