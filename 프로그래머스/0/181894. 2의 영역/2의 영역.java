import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        if(!list.contains(2)) return new int[]{-1};
        return Arrays.copyOfRange(arr, list.indexOf(2), list.lastIndexOf(2) + 1);
    }
}