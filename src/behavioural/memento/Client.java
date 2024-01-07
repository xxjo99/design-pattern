package behavioural.memento;

public class Client {

    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        // 상태 생성 및 저장
        originator.setState("save State");
        careTaker.add(originator.saveState());

        // 현재의 상태만 생성
        originator.setState("current State");

        System.out.println("Current State: " + originator.getState()); // 현재의 상태 출력
        originator.getState(careTaker.get(0));
        System.out.println("saved State: " + originator.getState()); // 저장된 상태 출력
    }

}
