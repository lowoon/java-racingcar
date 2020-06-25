package domain;

public class Position {
    private final int position;

    private Position(int position) {
        this.position = position;
    }

    public static Position init() {
        return new Position(0);
    }

    public Position move() {
        return new Position(position + 1);
    }

    public int getValue() {
        return position;
    }
}
