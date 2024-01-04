package behavioural.mediator;

// 채팅을 전송하는 예제
public class Client {

    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();

        Colleague user1 = new ConcreteColleague(mediator, "lee");
        Colleague user2 = new ConcreteColleague(mediator, "kim");
        Colleague user3 = new ConcreteColleague(mediator, "park");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);

        user1.send("안녕하세요");

        mediator.deleteUser(user3);

        user2.send("yon없지?");
    }
}
