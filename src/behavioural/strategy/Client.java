package behavioural.strategy;

// 로봇 움직임 설정
public class Client {

    public static void main(String[] args) {
        Robot robot = new Robot(new Walk(), new Catch());
        robot.move();
        robot.behavior();

        // 로봇의 전략 변경
        robot.setMove(new Run());

        robot.move();
    }

}
