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

    @Test
    void decideMaxPosition() {
        Car first = new Car(new Name("pobi"), new TestStrategy(4));
        Car second = new Car(new Name("crong"), new TestStrategy(3));
        Cars cars = Cars.from(Arrays.asList(first, second));

        cars.race();

        assertThat(cars.getMaxPosition().getValue()).isEqualTo(1);
    }

    @Test
    void findOneWinner() {
        Car first = new Car(new Name("pobi"), new TestStrategy(4));
        Car second = new Car(new Name("crong"), new TestStrategy(3));
        Cars cars = Cars.from(Arrays.asList(first, second));

        cars.race();

        assertThat(cars.findWinners().get(0).getName().getValue()).isEqualTo("pobi");
    }

    @Test
    void findWinners() {
        Car first = new Car(new Name("pobi"), new TestStrategy(4));
        Car second = new Car(new Name("crong"), new TestStrategy(4));
        Cars cars = Cars.from(Arrays.asList(first, second));

        cars.race();

        assertAll(
            () -> assertThat(cars.findWinners().get(0).getName().getValue()).isEqualTo("pobi"),
            () -> assertThat(cars.findWinners().get(1).getName().getValue()).isEqualTo("crong")
        );
    }
}
