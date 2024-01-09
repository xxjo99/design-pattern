package behavioural.observer;

// 뉴스 수신 예제
public class Client {

    public static void main(String[] args) {
        ConcreteSubject newsPublisher = new ConcreteSubject();

        ConcreteObserver newsSubscriber1 = new ConcreteObserver("옵저버1", newsPublisher);
        ConcreteObserver newsSubscriber2 = new ConcreteObserver("옵저버2", newsPublisher);

        newsPublisher.setNews("특보", "옵저버 패턴이 만들어졌습니다.");
        newsPublisher.setNews("정정", "옵저버 패턴으로 내용이 정정됨을 알립니다.");

        newsPublisher.removeObserver(newsSubscriber1);
        newsPublisher.setNews("속보", "누군가 구독 해제를 했습니다.");
    }

}
