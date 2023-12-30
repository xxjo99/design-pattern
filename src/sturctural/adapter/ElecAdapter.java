package sturctural.adapter;

// Adapter
public class ElecAdapter implements Elec110v {
    private Elec220v elec220v;

    public ElecAdapter(Elec220v elec220v) {
        this.elec220v = elec220v;
    }

    // Elec220v의 connect를 호출
    @Override
    public void powerOn() {
        elec220v.connect();
    }
}
