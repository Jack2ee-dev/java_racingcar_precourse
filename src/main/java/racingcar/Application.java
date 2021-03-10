package racingcar;

import java.util.Scanner;

import racingcar.controller.racing.Racing;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        Racing racing = new Racing(scanner);
        racing.start();
    }
}
