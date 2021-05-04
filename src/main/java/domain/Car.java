package domain;

import java.util.Objects;

public class Car {
    private final Name name;
    private final Position position;

    public Car(String name) {
        this.name = new Name(name);
        this.position = new Position();
    }

    public Car(String name, int position) {
        this.name = new Name(name);
        this.position = new Position(position);
    }

    public void move(MovingStrategy movingStrategy) {
        if(movingStrategy.movable()){
            position.plus();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name) && Objects.equals(position, car.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position);
    }

    @Override
    public String toString() {
        StringBuffer line = new StringBuffer();
        line.append(this.name.getName() + " : ");
        for (int i = 0; i < position.getPosition(); i++) {
            line.append("-");
        }

        return line.toString();
    }

    public Position getMaxPosition(Position maxPosition) {
        return position.compare(maxPosition) ? position : maxPosition;
    }

    public boolean isWinner(Position max) {
        return this.position.equals(max);
    }

    public Name getName() {
        return this.name;
    }
}
