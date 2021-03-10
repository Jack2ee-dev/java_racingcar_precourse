package racingcar.exception;

public class RacingcarException extends RuntimeException{

    public RacingcarException(String message) {
        super("[ERROR] " + message);
    }
}
