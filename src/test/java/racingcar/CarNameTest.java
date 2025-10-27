package racingcar;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.Test;

import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarNameTest extends NsTest {

    @Test
    void 입력값_자동차이름_split_정상동작_검증() {
        assertThat(CarNameSplitter.splitInput("pobi,woni,jun"))
            .containsExactly("pobi", "woni", "jun");
    }

    @Test
    void 입력값_자동차이름_5자이하_검증() {
        assertThatThrownBy(() ->
                CarNameSplitter.splitInput("pobi,javaji"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 입력값_자동차이름_null_검증() {
        assertThatThrownBy(() ->
                CarNameSplitter.splitInput(null))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 입력값_자동차이름_중복_검증() {
        assertThatThrownBy(() ->
                CarNameSplitter.splitInput("pobi,pobi"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Override
    public void runMain() {
        Application.main(new String[]{});
    }
}
