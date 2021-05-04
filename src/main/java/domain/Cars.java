package domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> carList;

    public Cars(String names) {
        this.carList = initCarList(names);
    }

    public Cars(List<Car> list) {
        this.carList = list;
    }

    private List<Car> initCarList(String names) {
        List<Car> list = new ArrayList<>();
        for (String name : names.split(",")) {
            list.add(new Car(name));
        }
        return list;
    }

    public int carsCount() {
        return carList.size();
    }

    public List<Car> getCarList() {
        return carList;
    }

    public List<Car> findWinner() {
        List<Car> winners = new ArrayList<>();
        Position maxPostion = getMaxPosition();
        for(Car car : carList){
            setWinner(winners, car, maxPostion);
        }
        return winners;
    }

    private void setWinner(List<Car> winners, Car car, Position maxPostion) {
        if(car.isWinner(maxPostion)){
            winners.add(car);
        }
    }

    private Position getMaxPosition() {
        Position maxPosition = new Position();
        for (Car car : carList) {
            maxPosition = car.getMaxPosition(maxPosition);
        }
        return maxPosition;
    }

    public List<String> getCarNames() {
        List<String> names = new ArrayList<>();
        for(Car car : carList){
            names.add(car.getName().toString());
        }
        return names;
    }
}
