package creational.builder;

// 컴퓨터 만드는 예제
public class Client {

    public static void main(String[] args) {
        ComputerFactory computerFactory = new ComputerFactory();

        computerFactory.setBuilder(new ConcreteBuilder());

        computerFactory.make();

        Computer computer = computerFactory.getComputer();
        System.out.println(computer.toString());
    }
}
