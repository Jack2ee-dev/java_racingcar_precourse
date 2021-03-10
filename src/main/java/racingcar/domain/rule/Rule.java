package racingcar.domain.rule;

import java.util.HashMap;
import java.util.Map;

public class Rule {

    public static final Map<String, String> CAR_NAME_DELIMITER = new HashMap<String, String>() {{
        put("DELIMITER", ",");
        put("DELIMITER_KOR", "쉼표");
    }};

    private Rule() {}
}
