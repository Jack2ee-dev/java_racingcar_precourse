package racingcar.domain.rule;

import java.util.HashMap;
import java.util.Map;

public class Rule {

    private static final Map<String, String> CAR_NAME_DELIMITER = new HashMap<String, String>() {{
        put(DELIMITER, ",");
        put(DELIMITER_KOR, "쉼표");
    }};
    private static final String DELIMITER = "DELIMITER";
    private static final String DELIMITER_KOR = "DELIMITER_KOR";
    private static final String PROGRESS_BAR = "-";
    private static final String WINNER_CONCAT_DELIMITER = ", ";

    private Rule() {
    }

    public static String getDelimiterSentence() {
        return "이름은 " +
            CAR_NAME_DELIMITER.get(DELIMITER_KOR) +
            "(" +
            CAR_NAME_DELIMITER.get(DELIMITER) +
            ") 기준으로 구분)";
    }

    public static String getDelimiter() {
        return CAR_NAME_DELIMITER.get(DELIMITER);
    }

    public static String getDelimiterKor() {
        return CAR_NAME_DELIMITER.get(DELIMITER_KOR);
    }

    public static String getProgressBar() {
        return PROGRESS_BAR;
    }

    public static String getWinnerConcatDelimiter() {
        return WINNER_CONCAT_DELIMITER;
    }
}
