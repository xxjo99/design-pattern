package behavioural.strategy;

// ConcreteStrategy
public class Catch implements BehaviorStrategy {

    @Override
    public void behavior() {
        System.out.println("잡기");
    }

}
