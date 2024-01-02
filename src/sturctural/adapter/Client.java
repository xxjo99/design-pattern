package sturctural.adapter;

// 어댑터를 통해 각기 다른 전압을 통합하는 예제
public class Client {

    public static void main(String[] args) {
        Elec110v hairDryer = new HairDryer();
        Elec110v cleaner = new ElecAdapter(new Cleaner());
        Elec110v airConditional = new ElecAdapter(new AirConditioner());
    }
}
