import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        
        List<Integer> list = new ArrayList<>();
        
        while(true){
            
            list.add(n);
            if(n == 1) break;
            
            if((n & 1) == 1){
                n = 3 * n + 1;
            } else {
                n /= 2;
            }
        }
        
        return list.stream().mapToInt(i->i).toArray();
    }
}