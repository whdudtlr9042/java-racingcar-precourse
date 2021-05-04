import domain.Cars;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {

    @Test
    void 자동차_목록_생성() {
        String names = "jack,mark,bob";
        Cars cars = new Cars(names);
        assertThat(cars.carsCount()).isEqualTo(names.split(",").length);
    }
}
