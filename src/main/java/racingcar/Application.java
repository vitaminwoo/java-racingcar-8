package racingcar;

import camp.nextstep.edu.missionutils.Console;

import java.util.List;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        // 1. 경주할 자동차 이름
        System.out.println("경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 기준으로 구분)");
        List<String> carNamesList = CarNameSplitter.splitInput(Console.readLine());

        // 2. 시도 횟수
        System.out.println("시도할 횟수는 몇 회인가요?");
        int moveCount = MoveCountConverter.convertInput(Console.readLine());

        // 3. 경주 진행
        System.out.println("실행 결과");
        Map<String, Integer> raceResult = StartRacing.runRacing(carNamesList, moveCount);

    }
}
