package view;

import domain.Car;

import java.util.List;
import java.util.stream.Stream;

public class ResultView {
    public void renderMove(Car car) {
        System.out.println(car.toString());
    }

    public void renderWinner(List<String> winner) {
        if (winner.size() > 0) {
            System.out.println(String.join(",", winner) + "가 최종 우승했습니다.");
        } else {
            System.out.println("우승자는 없습니다.");
        }
    }
}
