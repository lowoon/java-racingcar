package domain;

public class Car {
    private static final int CRITERIA = 4;

    private final MoveStrategy moveStrategy;
    private Position position;

    public Car(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
        this.position = Position.init();
    }

    public void move() {
        if(moveStrategy.generateNumber() >= CRITERIA) {
            position = position.move();
        }
    }

    public int getPosition() {
        return position.getValue();
    }
}
