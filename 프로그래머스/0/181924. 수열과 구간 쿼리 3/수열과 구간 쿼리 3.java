import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        IntStream.range(0, queries.length)
                 .forEach(i -> {
                     int temp = arr[queries[i][0]];
                     arr[queries[i][0]] = arr[queries[i][1]];
                     arr[queries[i][1]] = temp;
                 });
        return arr;
    }
}