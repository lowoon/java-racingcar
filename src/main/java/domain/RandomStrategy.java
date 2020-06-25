package domain;

public class RandomStrategy implements MoveStrategy {
    private int limit;

    public RandomStrategy(int limit) {
        this.limit = limit;
    }

    @Override
    public int generateNumber() {
        return (int)(Math.random() * limit);
    }
}
