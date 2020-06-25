import domain.Cars;
import domain.RandomStrategy;
import view.InputView;
import view.OutputView;

public class Application {
    public static final int LIMIT = 10;

    public static void main(String[] args) {
        String inputNames = InputView.receiveCarNames();
        Cars cars = Cars.of(inputNames, new RandomStrategy(LIMIT));
        int tryCount = Integer.parseInt(InputView.receiveTryCount());

        OutputView.printResult();
        for (int i = 0; i < tryCount; i++) {
            cars.race();
            OutputView.printEachResult(cars.getCars());
        }

        OutputView.printWinners(cars.findWinners());
    }
}
