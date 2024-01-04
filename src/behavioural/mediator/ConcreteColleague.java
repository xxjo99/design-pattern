package behavioural.mediator;

import java.util.ArrayList;
import java.util.List;

// colleague 구현
public class ConcreteColleague extends Colleague {
    public ConcreteColleague(Mediator mediator, String name) {
        super(mediator, name);
    }
    @Override
    public void send(String msg) {
        System.out.println(this.name+": Sending Message="+msg);
        mediator.sendMessage(this, msg);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.name+": Received Message:"+msg);
    }
}