package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Balls {
    private final List<Ball> ballList;
    final static int ballCount = 3;

    public Balls(List<Ball> ballList) {

        if (ballList.size() != ballCount) {
            throw new IllegalArgumentException(String.format("볼의 갯수는 반드시 %s개 여야 합니다.", ballCount));
        }

        this.ballList = Collections.unmodifiableList(new ArrayList<>(ballList));
    }

    List<Ball> getBallList() {
        return ballList;
    }
}
