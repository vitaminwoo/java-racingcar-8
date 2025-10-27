package racingcar;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.Test;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class RacingResultTest extends NsTest {

    private static final int MOVING_FORWARD = 4;
    private static final int STOP = 3;

    @Test
    void 경주_단일우승자_통합테스트() {
        assertRandomNumberInRangeTest(
                () -> {
                    run("pobi,woni,jun", "1");
                    assertThat(output()).contains("pobi : -", "woni : ", "jun : ", "최종 우승자 : pobi");
                },
                MOVING_FORWARD, STOP, STOP
        );
    }

    @Test
    void 경주_복수우승자_통합테스트1() {
        assertRandomNumberInRangeTest(
                () -> {
                    run("pobi,woni", "2");
                    assertThat(output()).contains("pobi : -", "woni : -", "최종 우승자 : pobi, woni");
                },
                MOVING_FORWARD, STOP, STOP, MOVING_FORWARD
        );
    }

    @Test
    void 경주_전원우승자_통합테스트() {
        assertRandomNumberInRangeTest(
                () -> {
                    run("a,b,c,d,e", "1");
                    assertThat(output()).contains("최종 우승자 : a, b, c, d, e");
                },
                MOVING_FORWARD, MOVING_FORWARD, MOVING_FORWARD, MOVING_FORWARD, MOVING_FORWARD
        );
    }

    @Test
    void 움직이지않고_우승_테스트() {
        assertRandomNumberInRangeTest(
                () -> {
                    run("a,b", "1");
                    assertThat(output()).contains("a : ", "b : ", "최종 우승자 : a, b");
                },
                STOP, STOP
        );
    }

    @Test
    void 최대_moveCount로_우승_테스트() {
        assertRandomNumberInRangeTest(
                () -> {
                    run("a,b", "3");
                    assertThat(output()).contains("a : ---", "b : ", "최종 우승자 : a");
                },
                MOVING_FORWARD, STOP, MOVING_FORWARD, STOP, MOVING_FORWARD, STOP
                );
    }


    @Override
    public void runMain() {
        Application.main(new String[]{});
    }
}
