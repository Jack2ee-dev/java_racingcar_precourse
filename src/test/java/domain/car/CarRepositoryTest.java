package domain.car;

import org.junit.jupiter.api.Test;

import java.util.List;

import racingcar.domain.car.Car;
import racingcar.domain.car.CarRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CarRepositoryTest {

    private static final List<Car> CARS = CarRepository.cars();
    private static final String[] INSERTED_CAR_NAMES = {"woonjang", "sangwoo", "jaeheyok"};

    @Test
    void 자동차의_일급객체가_잘생성되는지() {
        assertEquals(CARS.size(), 0);
        assertThrows(UnsupportedOperationException.class, () ->
            CARS.add(new Car("")));
        assertThrows(UnsupportedOperationException.class, () ->
            CARS.remove(0));
    }

    @Test
    void addAll_잘_작동하는지() {
        // when
        CarRepository.addAll(INSERTED_CAR_NAMES);

        // then
        assertEquals(CARS.get(0).getName(), INSERTED_CAR_NAMES[0]);
        assertEquals(CARS.get(1).getName(), INSERTED_CAR_NAMES[1]);
        assertEquals(CARS.get(2).getName(), INSERTED_CAR_NAMES[2]);
    }

    @Test
    void getWinnerNames_잘_작동하는지() {
        // given
        CarRepository.addAll(INSERTED_CAR_NAMES);

        // when1
        CarRepository.cars().get(0).progress();

        // then1
        assertEquals(CarRepository.getWinnerNames().length, 1);
        assertEquals(CarRepository.getWinnerNames()[0], INSERTED_CAR_NAMES[0]);

        // when2
        CarRepository.cars().get(1).progress();

        // then2
        assertEquals(CarRepository.getWinnerNames().length, 2);
        assertEquals(CarRepository.getWinnerNames()[0], INSERTED_CAR_NAMES[0]);
        assertEquals(CarRepository.getWinnerNames()[1], INSERTED_CAR_NAMES[1]);
    }
}
