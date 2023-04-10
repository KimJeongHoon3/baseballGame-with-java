package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static constant.Rules.BALL_COUNT;

public class Balls {
    private final List<Ball> ballList;


    public Balls(List<Ball> ballList) {

        if (ballList.size() != BALL_COUNT) {
            throw new IllegalArgumentException(String.format("볼의 갯수는 반드시 %s개 여야 합니다.", BALL_COUNT));
        }

        this.ballList = Collections.unmodifiableList(new ArrayList<>(ballList));
    }

    List<Ball> getBallList() {
        return ballList;
    }
}
