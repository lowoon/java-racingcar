package domain;

public class Car {
    private static final int CRITERIA = 4;

    private final Name name;
    private final MoveStrategy moveStrategy;
    private Position position;

    public Car(Name name, MoveStrategy moveStrategy) {
        this.name = name;
        this.moveStrategy = moveStrategy;
        this.position = Position.init();
    }

    public void move() {
        if (moveStrategy.generateNumber() >= CRITERIA) {
            position = position.move();
        }
    }

    public Position getPosition() {
        return position;
    }

    public Name getName() {
        return name;
    }
}
