package domain.rule;

import org.junit.jupiter.api.Test;

import racingcar.domain.rule.Rule;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RuleTest {

    private static final String DELIMITER_SENTENCE = "(이름은 쉼표(,) 기준으로 구분)";

    @Test
    void 구분기준_문구_잘가지고_오는지() {
        assertEquals(Rule.getDelimiterSentence(), DELIMITER_SENTENCE);
    }

    @Test
    void 구분기준_쉼표_잘가지고_오는지() {
        assertEquals(Rule.getDelimiter(), ",");
    }

    @Test
    void 구분기준_쉼표_한국어로_잘가지로_오는지() {
        assertEquals(Rule.getDelimiterKor(), "쉼표");
    }

    @Test
    void 진행막대_잘가지고_오는지() {
        assertEquals(Rule.getProgressBar(), "-");
    }

    @Test
    void 우승자_조인_기준_잘가지고_오는지() {
        assertEquals(Rule.getWinnerConcatDelimiter(), ", ");
    }
}
