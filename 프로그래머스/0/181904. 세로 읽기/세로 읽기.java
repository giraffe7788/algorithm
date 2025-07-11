import java.util.stream.*;

class Solution {
    public String solution(String my_string, int m, int c) {
        return IntStream.range(0, my_string.length())
                        .filter(i -> i % m == c - 1)
                        .mapToObj(i -> my_string.charAt(i))
                        .map(String::valueOf)
                        .collect(Collectors.joining());
    }
}