package domain;

public class RandomStrategy implements MoveStrategy {
    private final int limit;

    public RandomStrategy(int limit) {
        this.limit = limit;
    }

    @Override
    public int generateNumber() {
        return (int)(Math.random() * limit);
    }
}
