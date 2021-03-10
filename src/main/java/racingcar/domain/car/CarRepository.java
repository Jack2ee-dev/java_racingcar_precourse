package racingcar.domain.car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarRepository {
    private static final List<Car> cars = new ArrayList<>();

    private CarRepository() {

    }

    public static List<Car> cars() {
        return Collections.unmodifiableList(cars);
    }

    public static void addAll(String[] carNames) {
        for (String carName : carNames) {
            add(carName);
        }
    }

    public static String[] getWinnerNames() {
        List<Car> winnerList = winnerList();
        String[] winnerArray = new String[winnerList.size()];
        for (int i = 0; i < winnerArray.length; i++) {
            winnerArray[i] = winnerList.get(i).getName();
        }
        return winnerArray;
    }

    private static List<Car> winnerList() {
        int maxPosition = maxPosition();
        List<Car> winners = new ArrayList<>();
        for (Car car : cars) {
            if (car.getPosition() >= maxPosition) {
                winners.add(car);
            }
        }
        return winners;
    }

    private static int maxPosition()  {
        int maxPosition = Integer.MIN_VALUE;
        for (Car car : cars) {
            maxPosition = Math.max(maxPosition, car.getPosition());
        }
        return maxPosition;
    }

    private static void add(String carName) {
        cars.add(new Car(carName));
    }
}
