package behavioural.command;

// ConcreateCommand
// 컴퓨터를 켜는 기능 구현
public class ComputerOnCommand implements Command {

    private Computer computer;

    public ComputerOnCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.turnOn();
    }
}
