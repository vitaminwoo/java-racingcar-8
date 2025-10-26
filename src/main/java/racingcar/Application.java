package racingcar;

import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        // 1. 경주할 자동차 이름
        System.out.println("경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 기준으로 구분)");
        List<String> carNamesList = CarNameSplitter.splitCarNames(Console.readLine());

        // 2. 시도 횟수
        System.out.println("시도할 횟수는 몇 회인가요?");

    }
}
