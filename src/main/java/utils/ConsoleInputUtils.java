package utils;

import racingcar.domain.rule.Rule;

public class ConsoleInputUtils {

    public static String[] carNamesArray(String carNames) {
        String sanitized = sanitize(carNames);
        return split(sanitized);
    }

    public static int trialNumber(String trial) {
        return Integer.parseInt(trial);
    }

    private static String[] split(String input) {
        return input.split(Rule.getDelimiter());
    }

    private static String sanitize(String input) {
        String sanitized = input;
        sanitized = sanitizeWhiteSpace(sanitized);
        sanitized = sanitizeFirstRest(sanitized);
        sanitized = sanitizeLastRest(sanitized);
        return sanitized;
    }

    private static String sanitizeWhiteSpace(String input) {
        return input.replaceAll("\\s+", "");
    }

    private static String sanitizeFirstRest(String input) {
        return input.replaceAll("^,", "");
    }

    private static String sanitizeLastRest(String input) {
        return input.replaceAll(",$", "");
    }
}
