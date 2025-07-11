import java.util.*;

class Solution {
    public int[] solution(int[] arr) {

        Stack<Integer> stack = new Stack<>();
        int i = 0;

        while(i < arr.length) {
            if(stack.empty() || stack.peek() < arr[i]) {
                stack.push(arr[i]);
                i++;
            } else {
                stack.pop();
            }
        }

        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}