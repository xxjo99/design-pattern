package sturctural.facade;

import sturctural.facade.subSystem.Dry;
import sturctural.facade.subSystem.Rinse;
import sturctural.facade.subSystem.Wash;

// Facade
public class Facade {
    Wash wash;
    Rinse rinse;
    Dry dry;

    public Facade() {
        wash = new Wash();
        rinse = new Rinse();
        dry = new Dry();
    }

    public void start() {
        wash.startWash();
        rinse.startRinse();
        dry.startDry();
    }
}
