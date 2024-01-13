package behavioural.strategy;

// ConcreteStrategy
public class Walk implements MoveStrategy {

    @Override
    public void move() {
        System.out.println("걷기");
    }

}
