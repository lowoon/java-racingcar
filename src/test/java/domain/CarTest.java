package domain;

import static org.assertj.core.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class CarTest {
    @ParameterizedTest
    @MethodSource("createNumberAndPosition")
    void move(int number, int position) {
        Car car = new Car(new TestStrategy(number));

        car.move();

        assertThat(car.getPosition()).isEqualTo(position);
    }

    private static Stream<Arguments> createNumberAndPosition() {
        return Stream.of(
            Arguments.of(3, 0),
            Arguments.of(4, 1)
        );
    }
}
