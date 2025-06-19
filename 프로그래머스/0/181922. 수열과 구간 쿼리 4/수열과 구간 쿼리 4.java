import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        IntStream.range(0, queries.length)
                 .forEach(i ->
                     IntStream.rangeClosed(queries[i][0], queries[i][1])
                              .filter(val -> val % queries[i][2] == 0)
                              .forEach(j -> {
                                  arr[j] = arr[j] + 1;
                              })
        );
        return arr;
    }
}