package sturctural.proxy.nomalProxy;

import sturctural.proxy.RealSubject;
import sturctural.proxy.Subject;

public class Proxy implements Subject {
    private RealSubject realSubject;

    Proxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void action() {
        realSubject.action(); // 위임
        System.out.println("프록시 객체 : 액션");
    }
}
