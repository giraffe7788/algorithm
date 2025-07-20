import java.util.*;

class Solution {
    public static int[] solution(int[] arr, int[] query) {

        int start = 0;
        int end = arr.length - 1;

        for(int i = 0; i < query.length; i++){
            if((i & 1) == 0){
                end = start + query[i];
            } else {
                start += query[i];
            }
        }

        return Arrays.copyOfRange(arr, start, end + 1);
    }
}