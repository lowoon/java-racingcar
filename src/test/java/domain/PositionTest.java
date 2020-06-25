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
}
