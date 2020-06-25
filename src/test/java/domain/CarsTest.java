package domain;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class CarsTest {
    @Test
    void race() {
        Car first = new Car(new Name("pobi"), new TestStrategy(4));
        Car second = new Car(new Name("crong"), new TestStrategy(3));
        Cars cars = Cars.from(Arrays.asList(first, second));

        cars.race();

        assertAll(
            () -> assertThat(cars.getCars().get(0).getPosition().getValue()).isEqualTo(1),
            () -> assertThat(cars.getCars().get(1).getPosition().getValue()).isEqualTo(0)
        );
    }
}
