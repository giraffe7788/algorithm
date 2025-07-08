import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int[] arr = new int[52];
        
        for(int i = 0; i < my_string.length(); i++){
            int index = my_string.charAt(i) >= 'a' ? my_string.charAt(i) -'a' + 26 : my_string.charAt(i) - 'A';
            arr[index] = arr[index] + 1;
        }
        
        return arr;
    }
}