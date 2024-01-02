package sturctural.adapter;

// Adaptee
// 110v를 사용하는 제품
public class HairDryer implements Elec110v {

    @Override
    public void powerOn() {
        System.out.println("헤어 드라이기 110V");
    }
}
