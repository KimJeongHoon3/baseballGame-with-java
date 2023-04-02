package domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class BallsCheckerTest {
    BallsChecker ballsChecker = new BallsChecker();

    @Test
    void test() {
        // given
        Balls gameBalls = createBalls(3, 6, 7);
        Balls tryBalls = createBalls(3, 6, 9);

        // when
        Result result = ballsChecker.check(gameBalls, tryBalls);

        // then
        assertThat(result.getEnumMap())
                .hasSize(2)
                .containsEntry(Result.ResultStatus.STRIKE, 2L)
                .containsEntry(Result.ResultStatus.BALL, 1L);

    }

    private Balls createBalls(int firstNumber, int secondNumber, int thirdNumber) {
        Ball firstBall = new Ball(new BallNumber(firstNumber));
        Ball secondBall = new Ball(new BallNumber(secondNumber));
        Ball thirdBall = new Ball(new BallNumber(thirdNumber));
        return new Balls(Arrays.asList(firstBall, secondBall, thirdBall));
    }
}