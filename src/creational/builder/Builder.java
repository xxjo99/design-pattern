package creational.builder;

public abstract class Builder {

    abstract void setCpu();
    abstract void setRam();
    abstract void setStorage();
    abstract Computer getComputer();
}
