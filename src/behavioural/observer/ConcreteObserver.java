package behavioural.observer;

public class ConcreteObserver implements Observer{
    private String observerName;
    private String news;
    private Subject subject;

    public ConcreteObserver(String subscriber, Subject subject) {
        this.observerName = subscriber;
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(String title, String news) {
        this.news = title + "!!! " + news;
        display();
    }

    private void display() {
        System.out.println("=== " + observerName + " 수신 내용 ===\n" + news + "\n");
    }
}
