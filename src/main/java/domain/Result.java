package domain;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Result {
    private final Map<ResultStatus, Long> enumMap;
    private Result(Map<ResultStatus, Long> enumMap) {
        this.enumMap = enumMap;
    }

    public Map<ResultStatus, Long> getEnumMap() {
        return enumMap;
    }

    public static Result valueOf(List<ResultStatus> resultStatusList) {
        EnumMap<ResultStatus, Long> enumMap = resultStatusList.stream()
                .collect(Collectors.groupingBy(Function.identity()
                        , () -> new EnumMap<>(ResultStatus.class)
                        , Collectors.counting()));
        return new Result(enumMap);
    }

    enum ResultStatus {
        STRIKE,
        BALL
    }
}
