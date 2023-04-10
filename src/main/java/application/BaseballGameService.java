package application;

import domain.Ball;
import domain.Balls;
import domain.GameBallNumberStrategy;

import java.util.ArrayList;
import java.util.List;

import static constant.Rules.BALL_COUNT;

public class BaseballGameService {

    private final GameBallNumberStrategy gameBallNumberStrategy;

    public BaseballGameService(GameBallNumberStrategy gameBallNumberStrategy) {

        this.gameBallNumberStrategy = gameBallNumberStrategy;
    }

    public void start() {
        Balls gameBalls = createGameBalls();

    }

    private Balls createGameBalls() {
        List<Ball> ballList = new ArrayList<>();
        for (int i = 0; i < BALL_COUNT; i++) {
            ballList.add(Ball.createGameBall(gameBallNumberStrategy));
        }
        return new Balls(ballList);
    }
}
