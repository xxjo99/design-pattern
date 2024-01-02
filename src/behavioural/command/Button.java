package behavioural.command;

// Invoker
// 컴퓨터의 파워 조작, 커맨드 객체 사용
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
