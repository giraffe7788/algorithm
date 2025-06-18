import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] num_list) {
        int firstLast = num_list[num_list.length - 1];
        int secondLast = num_list[num_list.length - 2];
        int lastNum = firstLast > secondLast ? firstLast - secondLast : firstLast * 2;

        return IntStream.concat(IntStream.of(num_list), IntStream.of(lastNum)).toArray();
    }
}