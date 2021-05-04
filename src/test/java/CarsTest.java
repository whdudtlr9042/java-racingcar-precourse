import domain.Car;
import domain.Cars;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {

    @ParameterizedTest
    @ValueSource(strings = {"Test,Bob,mike,a", "pep,good,bad", "car,,,,"})
    void 자동차_목록_생성(String names) {
        Cars cars = new Cars(names);
        assertThat(cars.carsCount()).isEqualTo(names.split(",").length);
    }

    @Test
    void findWinnerTest() {
        Car bob = new Car("bob", 1);
        Car jack = new Car("jack", 2);
        Car rtos = new Car("rtos", 3);
        Car jun = new Car("jun", 3);

        List<Car> original = Arrays.asList(bob, jack, rtos, jun);
        Cars cars = new Cars(original);
        assertThat(cars.findWinner()).containsExactly(rtos, jun);
    }
}
