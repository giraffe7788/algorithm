import java.util.stream.*;

class Solution {
    public String[] solution(String[] strArr) {
        return Stream.of(strArr).filter(str -> !str.contains("ad")).toArray(String[]::new);
    }
}