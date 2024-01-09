package behavioural.observer;

import java.util.ArrayList;

public class ConcreteSubject implements Subject {
    private ArrayList<Observer> observers;
    private String title;
    private String news;

    public ConcreteSubject() {
        observers = new ArrayList<>();
        title = null;
        news = null;
    }

    // 옵저버 등록 구현
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    // 옵저버 삭제 구현
    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        observers.remove(index);
    }

    // 옵저버 업데이트 수현
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(title, news);
        }
    }

    // 뉴스 객체 설정
    public void setNews(String title, String news) {
        this.title = title;
        this.news = news;
        notifyObservers();
    }
}
