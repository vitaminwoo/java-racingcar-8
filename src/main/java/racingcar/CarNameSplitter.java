package racingcar;

import java.util.ArrayList;
import java.util.List;

public class CarNameSplitter {

    public static List<String> splitCarNames(String carNames) {
        List<String> carNamesList = new ArrayList<>();
        for (String carName : carNames.split(",")) {
            carNamesList.add(validateCarName(carName));
        }
        return carNamesList;
    }

    //예외 처리 검증은 여기서.
    public static String validateCarName(String carName) {

        return carName;
    }
}
