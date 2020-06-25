package view;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import domain.Car;

public class OutputView {
    public static void printResult() {
        System.out.println("실행 결과");
    }

    public static void printEachResult(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.getName().getValue() + " : " +
                Stream.generate(() -> "-")
                    .limit(car.getPosition().getValue())
                    .collect(Collectors.joining("")));
        }
        System.out.println();
    }

    public static void printWinners(List<Car> winners) {
        String winnerNames = winners.stream()
            .map(car -> car.getName().getValue())
            .collect(Collectors.joining(", "));
        System.out.println(winnerNames + "가 최종 우승했습니다.");
    }
}
