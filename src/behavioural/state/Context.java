package behavioural.state;

// Context를 통해 상태 설정
public class Context {
    private ElevatorState elevatorState;

    public Context() {
        this.elevatorState = StopState.getInstance();
    }

    public void setElevatorState(ElevatorState state) {
        this.elevatorState = state;
    }

    public void pushUpButton() {
        elevatorState.pushUpButton();
        this.setElevatorState(UpState.getInstance());
    }

    public void pushDownButton() {
        elevatorState.pushDownButton();
        this.setElevatorState(DownState.getInstance());
    }

    public void pushStopButton() {
        elevatorState.pushStopButton();
        this.setElevatorState(StopState.getInstance());
    }
}