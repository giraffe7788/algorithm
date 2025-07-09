import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public String solution(String my_string, int[] indices) {
        return IntStream.range(0, my_string.length())
                        .filter(i -> Arrays.stream(indices).noneMatch(j -> i == j))
                        .mapToObj(i -> String.valueOf(my_string.toCharArray()[i]))
                        .collect(Collectors.joining());
    }
}