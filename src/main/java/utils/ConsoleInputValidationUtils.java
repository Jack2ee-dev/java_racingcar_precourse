package utils;

import racingcar.console.input.exception.NoCarInputException;
import racingcar.console.input.exception.NotParsableToIntException;
import racingcar.domain.rule.Rule;

public class ConsoleInputValidationUtils {

    public void validateCarNames(String carNamesInput) throws NoCarInputException {
        if (carNamesInput.equals("") || carNamesInput.length() == 0) {
            throw new NoCarInputException();
        }
    }

    public void validateTrial(String trial) throws NotParsableToIntException {
        try {
            Integer.parseInt(trial);
        } catch (NumberFormatException e) {
            throw new NotParsableToIntException();
        }
    }
}
