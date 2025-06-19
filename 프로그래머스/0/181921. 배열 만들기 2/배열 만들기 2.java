import java.util.stream.IntStream;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer = IntStream.rangeClosed(l, r)
                                .filter(num -> String.valueOf(num).matches("[05]+"))
                                .toArray();
        answer = answer.length == 0 ? new int[]{-1} : answer;
        
        return answer;
    }
}