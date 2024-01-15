package creational.builder;

public class ConcreteBuilder extends Builder {

    private Computer computer;

    public ConcreteBuilder() {
        this.computer = new Computer("없음", "없음", "없음");
    }

    @Override
    void setCpu() {
        computer.setCpu("i7");
    }

    @Override
    void setRam() {
        computer.setRam("32G");
    }

    @Override
    void setStorage() {
        computer.setStorage("1T");
    }

    @Override
    Computer getComputer() {
        return computer;
    }
}
