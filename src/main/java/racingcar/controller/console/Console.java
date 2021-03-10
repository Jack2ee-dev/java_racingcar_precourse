package racingcar.controller.console;

import java.util.Scanner;

import racingcar.console.input.ConsoleInput;
import racingcar.console.input.exception.NoCarInputException;
import racingcar.console.input.exception.NotParsableToIntException;
import racingcar.console.output.ConsoleOutput;
import utils.ConsoleInputUtils;
import utils.ConsoleInputValidationUtils;

public class Console {
    private final ConsoleInput input;
    private final ConsoleOutput output;

    public Console(Scanner scanner) {
        this.input = new ConsoleInput(scanner);
        this.output = ConsoleOutput.init();
    }

    public String[] getCarNamesArray() {
        while (true) {
            String rawCarNames = this.input.getCarNamesInput();
            try {
                ConsoleInputValidationUtils.validateCarNames(rawCarNames);
                return ConsoleInputUtils.carNamesArray(rawCarNames);
            } catch (NoCarInputException e) {
                this.output.printError(e.getMessage());
            }
        }
    }

    public int getTrialNumber() {
        while (true) {
            String rawTrialNumber = this.input.getTrialInput();
            try {
                ConsoleInputValidationUtils.validateTrial(rawTrialNumber);
                return ConsoleInputUtils.trialNumber(rawTrialNumber);
            } catch (NotParsableToIntException e) {
                this.output.printError(e.getMessage());
            }
        }
    }
}
