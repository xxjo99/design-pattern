package sturctural.proxy.loggingProxy;

import sturctural.proxy.RealSubject;
import sturctural.proxy.Subject;

public class Proxy implements Subject {
    private RealSubject realSubject;

    Proxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void action() {
        System.out.println("로깅...");

        realSubject.action(); // 위임

        System.out.println("프록시 객체 : 액션");
        System.out.println("로깅...");
    }
}
