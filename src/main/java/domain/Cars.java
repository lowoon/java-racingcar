package domain;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {
    private final List<Car> cars;
    private Position maxPosition;

    private Cars(List<Car> cars) {
        this.cars = cars;
        this.maxPosition = Position.init();
    }

    public static Cars of(String inputNames, MoveStrategy moveStrategy) {
        List<Car> cars = Arrays.stream(inputNames.split(",", -1))
            .map(name -> new Car(new Name(name.trim()), moveStrategy))
            .collect(Collectors.toList());
        return new Cars(cars);
    }

    public static Cars from(List<Car> cars) {
        return new Cars(cars);
    }

    public void race() {
        for (Car car : cars) {
            car.move();
            decideMaxPosition(car);
        }
    }

    private void decideMaxPosition(Car car) {
        if (maxPosition.isBelow(car.getPosition())) {
            maxPosition = Position.from(car.getPosition());
        }
    }

    public List<Car> findWinners() {
        return cars.stream()
            .filter(car -> maxPosition.equals(car.getPosition()))
            .collect(Collectors.toList());
    }

    public List<Car> getCars() {
        return Collections.unmodifiableList(cars);
    }

    public Position getMaxPosition() {
        return maxPosition;
    }
}
