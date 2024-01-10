package behavioural.state;

// 엘리베이터 동작 예제
public class Client {
    public static void main(String[] args) {
        Context elevator = new Context();

        elevator.pushStopButton();
        elevator.pushDownButton();
        elevator.pushStopButton();
        elevator.pushUpButton();
        elevator.pushStopButton();
        elevator.pushUpButton();
        elevator.pushUpButton();
    }
}