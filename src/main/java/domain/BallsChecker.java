package domain;

import java.util.ArrayList;
import java.util.List;

public class BallsChecker {
    public Result check(Balls gameBalls, Balls tryBalls) {
        List<Result.ResultStatus> resultStatusList = new ArrayList<>();
        for (int i = 0; i < gameBalls.getBallList().size(); i++) {
             resultStatusList.add(doCheck(gameBalls.getBallList().get(i), tryBalls.getBallList().get(i)));
        }

        return Result.valueOf(resultStatusList);
    }

    private Result.ResultStatus doCheck(Ball gameBall, Ball tryBall) {
        return gameBall.equals(tryBall) ? Result.ResultStatus.STRIKE : Result.ResultStatus.BALL;
    }
}
