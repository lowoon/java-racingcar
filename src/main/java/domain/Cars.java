package domain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {
    private List<Car> cars;

    private Cars(List<Car> cars) {
        this.cars = cars;
    }

    public static Cars of(String inputNames, MoveStrategy moveStrategy) {
        List<Car> cars = Arrays.stream(inputNames.split(",", -1))
            .map(name -> new Car(new Name(name.trim()), moveStrategy))
            .collect(Collectors.toList());
        return new Cars(cars);
    }
}
