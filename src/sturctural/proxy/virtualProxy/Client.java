package sturctural.proxy.virtualProxy;

import sturctural.proxy.RealSubject;
import sturctural.proxy.Subject;

class Client {

    public static void main(String[] args) {
        Subject sub = new Proxy();
        sub.action();
    }

}