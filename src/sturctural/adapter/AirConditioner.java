package sturctural.adapter;

// Adaptee
public class AirConditioner implements Elec220v {

    @Override
    public void connect() {
        System.out.println("에어컨 220V 연결");
    }

}
