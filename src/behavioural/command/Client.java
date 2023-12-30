package behavioural.command;

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
