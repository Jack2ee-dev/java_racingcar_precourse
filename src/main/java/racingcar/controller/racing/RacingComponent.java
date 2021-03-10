package racingcar.controller.racing;

import java.util.Scanner;

import racingcar.domain.car.Car;
import racingcar.domain.car.CarRepository;
import racingcar.controller.console.Console;
import racingcar.domain.rule.Rule;

public class RacingComponent {

    private final Console console;
    private int turnCnt;

    public RacingComponent(Scanner scanner) {
        this.console = new Console(scanner);
    }

    public void getCarNames() {
        CarRepository.addAll(this.console.getCarNamesArray());
    }

    public void getTrial() {
        this.turnCnt = this.console.getTrialNumber();
    }

    private void turn() {
        for (Car car : CarRepository.cars()) {
            if (Rule.shouldProgress()) {
                car.progress();
            }
            this.console.printProgress(car.getName(), car.getPosition());
        }
        System.out.println();
    }

    public void printResult() {
        this.console.printResult();
    }

    public void turns() {
        for (int i = 0; i < this.turnCnt; i++) {
            turn();
        }
    }

    public void showWinners() {
        this.console.printWinners(CarRepository.getWinnerNames());
    }
}
