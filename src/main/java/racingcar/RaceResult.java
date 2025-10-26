package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RaceResult {

    private final Map<String, Integer> carMoveMap;

    public RaceResult(List<String> carNamesList) {
        this.carMoveMap = carNamesList.stream()
                .collect(Collectors.toMap(
                        carName -> carName,
                        carName -> 0
                ));
    }

    public void moveOneResult() {
        this.carMoveMap.forEach((carName, moveCount) -> {
            if(moveRequirement()){
                carMoveMap.put(carName, moveCount + 1);
            }
            String carMoveStr = "-".repeat(moveCount);
            System.out.println(carName + " : " + carMoveStr);
        });
    }
    public Map<String, Integer> getRaceResult() {
        return this.carMoveMap;
    }

    public boolean moveRequirement() {
        return Randoms.pickNumberInRange(0, 9) >= 4;
    }
}