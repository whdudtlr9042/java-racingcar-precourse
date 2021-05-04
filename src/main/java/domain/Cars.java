package domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> carList;

    public Cars(String names) {
        this.carList = initCarList(names);
    }

    private List<Car> initCarList(String names) {
        List<Car> list = new ArrayList<>();
        for(String name : names.split(",")){
            list.add(new Car(name));
        }
        return list;
    }

    public int carsCount() {
        return carList.size();
    }
}
