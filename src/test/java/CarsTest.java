import domain.Cars;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {

    @ParameterizedTest
    @ValueSource(strings = {"Test,Bob,mike,a", "pep,good,bad", "car,,,,"})
    void 자동차_목록_생성(String names) {
        Cars cars = new Cars(names);
        assertThat(cars.carsCount()).isEqualTo(names.split(",").length);
    }
}
