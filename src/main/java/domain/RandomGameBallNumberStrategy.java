package domain;

import constant.Rules;

import java.util.concurrent.ThreadLocalRandom;

public class RandomGameBallNumberStrategy implements GameBallNumberStrategy{
    @Override
    public BallNumber createGameBallNumber() {
        return new BallNumber(ThreadLocalRandom.current().nextInt(Rules.MAXIMUM_NUMBER));
    }
}
