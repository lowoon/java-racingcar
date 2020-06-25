package domain;

public class Car {
    private static final int CRITERIA = 4;

    private final MoveStrategy moveStrategy;
    private int position;

    public Car(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }

    public void move() {
        if(moveStrategy.generateNumber() >= CRITERIA) {
            position++;
        }
    }

    public int getPosition() {
        return position;
    }
}
