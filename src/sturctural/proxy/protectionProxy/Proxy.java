package sturctural.proxy.protectionProxy;

import sturctural.proxy.RealSubject;
import sturctural.proxy.Subject;

public class Proxy implements Subject {
    private RealSubject realSubject;
    boolean access; // 접근 권한

    Proxy(RealSubject realSubject, boolean access) {
        this.realSubject = realSubject;
        this.access = access;
    }

    @Override
    public void action() {
        realSubject.action(); // 위임
        System.out.println("프록시 객체 : 액션");
    }
}
