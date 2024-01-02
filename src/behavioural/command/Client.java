package behavioural.command;

// 컴퓨터를 켜고 끄는 예제
public class Client {

    public static void main(String[] args) {
        Computer computer = new Computer(); // Receiver

        // ConcreateCommand
        ComputerOnCommand computerOnCmd = new ComputerOnCommand(computer);
        ComputerOffCommand computerOffCmd = new ComputerOffCommand(computer);

        // Invoker
        Button btn = new Button(computerOnCmd);
        btn.pressButton();
        btn.setCommand(computerOffCmd);
        btn.pressButton();

    }
}
