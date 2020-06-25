package domain;

public class TestStrategy implements MoveStrategy {
    private int number;

    public TestStrategy(int number) {
        this.number = number;
    }

    @Override
    public int generateNumber() {
        return number;
    }
}
