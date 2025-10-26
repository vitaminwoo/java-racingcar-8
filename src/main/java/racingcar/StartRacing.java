package racingcar;

import java.util.List;
import java.util.Map;

public class StartRacing {

    public static Map<String, Integer> runRacing(List<String> carNamesList, int moveCount) {
        RaceResult raceResult = new RaceResult(carNamesList);
        for (int i = 0; i < moveCount; i++) {
            raceResult.moveOneResult();
        }
        return raceResult.getRaceResult();
    }

}
