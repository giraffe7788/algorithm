import java.util.stream.*;

class Solution {
    public int[] solution(String myString) {
        String[] strs = myString.split("x", -1);
        return Stream.of(strs).mapToInt(str -> str.length()).toArray();
    }
}