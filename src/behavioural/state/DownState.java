package behavioural.state;

// 엘리베이터가 내려가는 중인 상태
public class DownState implements ElevatorState {
    private static DownState upState;

    private DownState() {}

    public static DownState getInstance() {
        if (upState == null) {
            upState = new DownState();
        }
        return upState;
    }

    @Override
    public void pushUpButton() {
        System.out.println("동작 없음");
    }

    @Override
    public void pushDownButton() {
        System.out.println("내려감");
    }

    @Override
    public void pushStopButton() {
        System.out.println("멈춤");
    }
}