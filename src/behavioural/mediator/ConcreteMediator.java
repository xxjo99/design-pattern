package behavioural.mediator;

import java.util.ArrayList;
import java.util.List;

// mediator 구현
public class ConcreteMediator implements Mediator {
    private final List<Colleague> users;

    public ConcreteMediator() {
        this.users=new ArrayList<>();
    }

    @Override
    public void addUser(Colleague user) {
        this.users.add(user);
    }

    @Override
    public void deleteUser(Colleague user) {
        this.users.remove(user);
    }

    @Override
    public void sendMessage(Colleague user, String message) {
        for(Colleague u : this.users){
            if(u != user){
                u.receive(message);
            }
        }
    }
}