package racingcar.console.input.exception;

import racingcar.domain.rule.Rule;

public class NoCarInputException extends ConsoleInputException {

    private static final String NO_CAR_INPUT_EXCEPTION = "경주할 자동차 이름을 입력해야 합니다.(이름은 " +
        Rule.CAR_NAME_DELIMITER.get("DELIMITER_KOR") +
        "(" +
        Rule.CAR_NAME_DELIMITER.get("DELIMITER") +
        ")" +
        " 기준으로 구분)";

    public NoCarInputException() {
        super(NO_CAR_INPUT_EXCEPTION);
    }
}
