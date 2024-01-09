package behavioural.observer;

// 옵저버 등록, 삭제, 업데이트 선언
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
