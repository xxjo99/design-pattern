package behavioural.command;

// Invoker
public class Button {
    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    // 기능 설정
    public void setCommand(Command command) {
        this.command = command;
    }

    // 기능 요청
    public void pressButton() {
        this.command.execute();
    }
}
