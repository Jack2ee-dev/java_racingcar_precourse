package racingcar.controller.racing;

import java.util.Scanner;

import racingcar.domain.racingComponent.RacingComponent;

public class Racing {

    private final RacingComponent racingComponent;

    public Racing(Scanner scanner) {
        this.racingComponent = new RacingComponent(scanner);
    }

    public void start() {
        this.racingComponent.getCarNames();
        this.racingComponent.getTrial();
        this.racingComponent.turns();
        this.racingComponent.showWinners();
    }
}
