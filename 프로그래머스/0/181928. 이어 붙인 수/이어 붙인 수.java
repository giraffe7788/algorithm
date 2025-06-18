import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] num_list) {

        String odd = Arrays.stream(num_list)
                           .filter(n -> (n & 1) == 1)
                           .mapToObj(n -> String.valueOf(n))
                           .collect(Collectors.joining());

        String even = Arrays.stream(num_list)
                            .filter(n -> (n & 1) == 0)
                            .mapToObj(n -> String.valueOf(n))
                            .collect(Collectors.joining());

        return Integer.parseInt(odd) + Integer.parseInt(even);
    }
}