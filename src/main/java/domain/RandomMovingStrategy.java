package domain;

import java.util.Random;

public class RandomMovingStrategy implements MovingStrategy{
    private static final int MOVING_CONDITION = 4;
    private static final int RANGE = 10;
    private static final Random random = new Random();


    @Override
    public boolean movable() {
        return getRandom() >= MOVING_CONDITION;
    }

    private int getRandom() {
        return random.nextInt(RANGE);
    }
}
