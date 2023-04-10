package domain;

import java.util.Objects;

public class Ball {
    private final BallNumber ballNumber;

    private Ball(BallNumber ballNumber) {
        this.ballNumber = ballNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return Objects.equals(ballNumber, ball.ballNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ballNumber);
    }

    public static Ball createGameBall(GameBallNumberStrategy gameBallNumberStrategy) {
        return Ball.create(gameBallNumberStrategy.createGameBallNumber());
    }

    public static Ball create(BallNumber ballNumber) {
        return new Ball(ballNumber);
    }
}
