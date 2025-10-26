package racingcar;

public class MoveCountConverter {

    public static int convertInput(String moveCountString) {
        int moveCount;

        try {
            moveCount = validateMoveCount(Integer.parseInt(moveCountString));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("moveCount has to be Integer Value", e);
        }
        return moveCount;
    }

    public static int validateMoveCount(int moveCount) {
        if (moveCount <= 0) {
            throw new IllegalArgumentException("moveCount has to be positive");
        }
        return moveCount;
    }
}
