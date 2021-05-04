import domain.Car;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

   @Test
    void init() {
        Car name = new Car("jack");
        assertThat(name).isEqualTo(new Car("jack"));
    }


}
