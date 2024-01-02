package sturctural.adapter;

// Adapter
// 서로 다른 전압을 통합
public class ElecAdapter implements Elec110v {
    private Elec220v elec220v;

    public ElecAdapter(Elec220v elec220v) {
        this.elec220v = elec220v;
    }

    // Elec220v의 connect를 호출
    // Elec110v를 실행하면 220v의 connect가 실행
    @Override
    public void powerOn() {
        elec220v.connect();
    }
}
