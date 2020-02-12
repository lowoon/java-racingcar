package racingcar.domain;

public class Car {
    public static final int MOVING_CRITERIA = 4;
    public static final int MAXIMUM_NAME = 5;

    private String name;
    private int position;

    public Car(String name) {
        this.name = name;
        position = 0;
    }

    public void movePositionAccordingToCondition(int randomValue) {
        if (randomValue >= MOVING_CRITERIA) {
            moveForward();
        }
    }

    private void moveForward() {
        position++;
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public boolean hasOverFiveCharacterName() {
        return name.length() > MAXIMUM_NAME;
    }

    public boolean isEmpty() {
        return name.isEmpty();
    }
}
