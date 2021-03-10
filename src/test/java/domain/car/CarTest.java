package domain.car;

import org.junit.jupiter.api.Test;

import racingcar.domain.car.Car;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {

    private static final String TEST_CAR_NAME = "jack2ee";
    private static final int TEST_DEFAULT_CAR_PROGRESS = 0;

    @Test
    void 자동차객체_제대로_만들어지는지() {
        // when
        Car car = new Car(TEST_CAR_NAME);

        // then
        assertEquals(car.getName(), TEST_CAR_NAME);
        assertEquals(car.getPosition(), TEST_DEFAULT_CAR_PROGRESS);
    }

    @Test
    void 전진조건을_충족할경우_전진하는지() {
        // given
        Car car = new Car(TEST_CAR_NAME);

        // when
        car.progress();

        // then
        assertEquals(car.getPosition(), TEST_DEFAULT_CAR_PROGRESS + 1);
    }
}
