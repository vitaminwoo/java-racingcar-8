package racingcar;

public class MoveCountConverter {

    public static int convertInput(String moveCountString) {
        int moveCount;

        try {
            moveCount = Integer.parseInt(moveCountString);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("moveCount has to be Integer Value", e);
        }
        return moveCount;
    }

}
