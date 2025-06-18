import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = IntStream.range(0, queries.length)
                                .map(i ->
                                   IntStream.rangeClosed(queries[i][0], queries[i][1])
                                            .map(j -> arr[j])
                                            .filter(val -> val > queries[i][2])
                                            .min()
                                            .orElse(-1)
                                )
                                .toArray();
        return answer;
    }
}