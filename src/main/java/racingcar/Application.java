package racingcar;

import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        // 1. 경주할 자동차 이름
        System.out.println("경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 기준으로 구분)");
        String carNamesString = Console.readLine();
        List<String> carNamesList = CarNameSplitter.splitCarNames(carNamesString);

    }
}
