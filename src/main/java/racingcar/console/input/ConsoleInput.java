package racingcar.console.input;

import java.util.Scanner;

public class ConsoleInput {
    private final Scanner scanner;

    public ConsoleInput(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getCarNamesInput() {
        return this.scanner.nextLine();
    }

    public String getTrialInput() {
        return this.scanner.nextLine();
    }
}
