package behavioural.strategy;

// Context
public class Robot {

    MoveStrategy moveStrategy;
    BehaviorStrategy behaviorStrategy;

    public Robot(MoveStrategy moveStrategy, BehaviorStrategy behaviorStrategy) {
        this.moveStrategy = moveStrategy;
        this.behaviorStrategy = behaviorStrategy;
    }

    void move() {
        moveStrategy.move();
    }

    void behavior() {
        behaviorStrategy.behavior();
    }

    void setMove(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }

    void setBehavior(BehaviorStrategy behaviorStrategy) {
        this.behaviorStrategy = behaviorStrategy;
    }

}
