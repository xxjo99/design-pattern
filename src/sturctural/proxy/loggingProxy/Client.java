package sturctural.proxy.loggingProxy;

import sturctural.proxy.RealSubject;
import sturctural.proxy.Subject;

class Client {

    public static void main(String[] args) {
        Subject sub = new Proxy(new RealSubject());
        sub.action();
    }

}