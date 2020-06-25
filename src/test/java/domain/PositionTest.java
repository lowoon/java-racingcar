package domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PositionTest {
    @Test
    void move() {
        Position position = Position.init();
        position = position.move();

        assertThat(position.getValue()).isEqualTo(1);
    }

    @Test
    void isBelow() {
        Position position = Position.init();
        Position comparer = Position.init();

        comparer = comparer.move();

        assertThat(position.isBelow(comparer)).isTrue();
    }

    @Test
    void isNotBelow() {
        Position position = Position.init();
        Position comparer = Position.init();

        assertThat(position.isBelow(comparer)).isFalse();
    }
}
