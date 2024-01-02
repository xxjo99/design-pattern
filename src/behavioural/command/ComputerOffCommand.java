package behavioural.command;

// ConcreateCommand
// 컴퓨터를 끄는 기능 구현
public class ComputerOffCommand implements Command {
    private Computer computer;

    public ComputerOffCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.turnOff();
    }
}