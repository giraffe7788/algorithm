import java.util.*;
import java.util.stream.*;

class Solution {
    public String[] solution(String myString) {
        String[] strs = myString.split("x");
        Arrays.sort(strs);
        return Stream.of(strs).filter(str -> str.length() != 0).toArray(String[]::new);
    }
}