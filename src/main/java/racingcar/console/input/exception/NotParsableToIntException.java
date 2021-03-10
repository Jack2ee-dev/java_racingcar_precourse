package racingcar.console.input.exception;

public class NotParsableToIntException extends ConsoleInputException {

    private static final String NOT_PARSABLE_TO_INT_EXCEPTION = "시도 횟수는 숫자여야 한다.";

    public NotParsableToIntException() {
        super(NOT_PARSABLE_TO_INT_EXCEPTION);
    }
}
