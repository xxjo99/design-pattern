package sturctural.adapter;

// Adaptee
public class Cleaner implements Elec220v {

    @Override
    public void connect() {
        System.out.println("청소기 220V 연결");
    }

}
