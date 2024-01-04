package behavioural.mediator;

// mediator
// 유저의 추가, 삭제, 메시지 전송을 정의
public interface Mediator {
    void addUser(Colleague user);
    void deleteUser(Colleague user);
    void sendMessage(Colleague user, String message);
}
