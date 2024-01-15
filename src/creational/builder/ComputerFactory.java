package creational.builder;

// Director
public class ComputerFactory {

    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public void make() {
        builder.setRam();
        builder.setCpu();
        builder.setStorage();
    }

    public Computer getComputer() {
        return builder.getComputer();
    }
}
