package utils;

import racingcar.domain.rule.Rule;

public class ConsoleInputUtils {

    public String[] carNamesArray(String carNames) {
        String sanitized = sanitize(carNames);
        return split(sanitized);
    }

    public int trialNumber(String trial) {
        return Integer.parseInt(trial);
    }

    private String[] split(String input) {
        return input.split(Rule.getDelimiter());
    }

    private String sanitize(String input) {
        String sanitized = input;
        sanitized = sanitizeWhiteSpace(sanitized);
        sanitized = sanitizeFirstRest(sanitized);
        sanitized = sanitizeLastRest(sanitized);
        return sanitized;
    }

    private String sanitizeWhiteSpace(String input) {
        return input.replaceAll("\\s+", "");
    }

    private String sanitizeFirstRest(String input) {
        return input.replaceAll("^,", "");
    }

    private String sanitizeLastRest(String input) {
        return input.replaceAll(",$", "");
    }
}
