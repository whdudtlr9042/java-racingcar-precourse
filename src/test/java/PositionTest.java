import domain.Position;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class PositionTest {

    @Test
    void init() {
        Position position = new Position();
        assertThat(position).isEqualTo(new Position());
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,3})
    void 위치_이동(int move_count) {
        Position position = new Position();
        for(int i =0; i<move_count; i++){
            position.plus();
        }
        assertThat(position).isEqualTo(new Position(move_count));
    }

}
