package sturctural.adapter;

// Adaptee
// 220v를 사용하는 제품
public class Cleaner implements Elec220v {

    @Override
    public void connect() {
        System.out.println("청소기 220V 연결");
    }

}
