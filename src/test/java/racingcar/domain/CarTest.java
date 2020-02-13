package racingcar.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CarTest {
    public static final int ONE_STEP = 1;

    @Test
    void moveForward() {
        //given
        Car car = new Car("앨런");
        int initState = car.getPosition();
        //when
        car.moveForward();
        //then
        assertThat(car.getPosition()).isEqualTo(initState + ONE_STEP);
    }
}