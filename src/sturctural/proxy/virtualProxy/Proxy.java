package sturctural.proxy.virtualProxy;

import sturctural.proxy.RealSubject;
import sturctural.proxy.Subject;

public class Proxy implements Subject {
    private RealSubject realSubject;

    Proxy() {
    }

    @Override
    public void action() {
        // 실제 요청(메소드 호출)이 들어 왔을 때 실제 객체를 생성
        if (realSubject == null) {
            realSubject = new RealSubject();
        }

        realSubject.action(); // 위임
        System.out.println("프록시 객체 : 액션");
    }
}
