package racingcar;

import java.util.ArrayList;
import java.util.List;

public class CarNameSplitter {

    public static List<String> splitInput(String carNames) {
        nullCheckInput(carNames);

        List<String> carNamesList = new ArrayList<>();
        for (String carName : carNames.split(",")) {
            carNamesList.add(validateCarName(carName));
        }
        return carNamesList;
    }

    public static String validateCarName(String carName) {
        if (carName.length() > 5) {
            throw new IllegalArgumentException("carName only contains 5 characters");
        } else if (carName.isEmpty()) {
            throw new IllegalArgumentException("carName is empty");
        }
        return carName;
    }

    public static void nullCheckInput(String carNames) {
        if (carNames == null) {
            throw new IllegalArgumentException("carNames is null");
        }
    }

}
