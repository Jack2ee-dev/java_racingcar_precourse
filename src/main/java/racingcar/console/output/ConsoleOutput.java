package racingcar.console.output;

import racingcar.domain.car.Car;
import racingcar.domain.car.CarRepository;
import racingcar.domain.rule.Rule;

public class ConsoleOutput {

    private static final String ENTER_CAR_NAMES_SENTENCE = "경주할 자동차 이름을 입력하세요." +
        Rule.getDelimiterSentence();
    private static final String ENTER_TRIAL_SENTENCE = "시도할 회수는 몇회인가요?";
    private static final String RESULT_SENTENCE = "실행 결과";
    private static final String FINAL_WINNER_SENTENCE = "최종 우승자: ";

    private ConsoleOutput() {

    }

    public static ConsoleOutput init() {
        return new ConsoleOutput();
    }

    private static void print(String message) {
        System.out.print(message);
    }

    private static void println(String message) {
        System.out.println(message);
    }

    public void printEnterCarNameSentence() {
        println(ENTER_CAR_NAMES_SENTENCE);
    }

    public void printEnterTrialSentence() {
        println(ENTER_TRIAL_SENTENCE);
    }

    public void printResult() {
        println(RESULT_SENTENCE);
    }

    public void printError(String error) {
        println(error);
    }

    public void printWinners(String[] winners) {
        String winnersConcatenated = String.join(Rule.getWinnerConcatDelimiter(), winners);
        println("최종 우승자: " + winnersConcatenated);
    }

    public void printProgress(String carName, int position) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < position; i++) {
            sb.append(Rule.getProgressBar());
        }
        println(carName + " : " + sb.toString());
    }
}
