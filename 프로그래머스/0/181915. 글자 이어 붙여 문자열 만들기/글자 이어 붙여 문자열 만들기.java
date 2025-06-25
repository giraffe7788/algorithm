import java.util.stream.*;

class Solution {
    public String solution(String my_string, int[] index_list) {
        return IntStream.of(index_list)
                        .mapToObj(index ->
                            String.valueOf(my_string.toCharArray()[index])
                        ).collect(Collectors.joining());
    }
}