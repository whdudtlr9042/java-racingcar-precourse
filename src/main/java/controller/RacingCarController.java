package controller;

import domain.Car;
import domain.Cars;
import domain.RandomMovingStrategy;
import view.InputView;
import view.ResultView;

public class RacingCarController {

    private final InputView inputView;
    private final ResultView resultView;

    public RacingCarController() {
        this.inputView = new InputView();
        this.resultView = new ResultView();
    }

    public void run() {
        String names = inputView.initNames();
        int count = inputView.initCount();

        Cars cars = new Cars(names);

        racing(cars, count);

    }

    private void racing(Cars cars, int count) {
        for (int i = 0; i < count; i++) {
            drive(cars);
        }
    }

    private void drive(Cars cars) {
        for (Car car : cars.getCarList()) {
            car.move(new RandomMovingStrategy());
            resultView.renderMove(car);
        }
        System.out.println();
    }
}
