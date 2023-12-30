package sturctural.adapter;

// Adaptee
public class HairDryer implements Elec110v {

    @Override
    public void powerOn() {
        System.out.println("헤어 드라이기 110V");
    }
}
