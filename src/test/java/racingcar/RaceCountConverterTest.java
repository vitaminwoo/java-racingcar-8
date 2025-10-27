package racingcar;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class RaceCountConverterTest extends NsTest {

    @Test
    void 입력값_raceCount_toInt_정상동작_검증() {
        assertThat(RaceCountConverter.convertInput("5"))
                .isEqualTo(5);
    }

    @Test
    void 입력값_raceCount_null_검증() {
        assertThatThrownBy(() ->
                RaceCountConverter.convertInput(null))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 입력값_raceCount_numberFormat_missMatch_소수_검증() {
        assertThatThrownBy(() ->
                RaceCountConverter.convertInput("3.5"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 입력값_raceCount_numberFormat_missMatch_문자열_검증() {
        assertThatThrownBy(() ->
                RaceCountConverter.convertInput("a"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 입력값_raceCount_0_검증() {
        assertThatThrownBy(() ->
                RaceCountConverter.convertInput("0"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 입력값_raceCount_음수_검증() {
        assertThatThrownBy(() ->
                RaceCountConverter.convertInput("-3"))
                .isInstanceOf(IllegalArgumentException.class);
    }



    @Override
    public void runMain() {
        Application.main(new String[]{});
    }
}
