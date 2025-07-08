import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        Map<Character, Integer> map = new HashMap<>();
        
        for(char i = 'A'; i <= 'z' ; i++){
            if(i > 'Z' && i < 'a') continue;
            map.put(i, 0);
        }
        
        for(int i = 0; i < my_string.length(); i++){
            Character c = my_string.charAt(i);
            map.put(c, map.get(c) + 1);
        }
        
        return map.values().stream().mapToInt(Integer::valueOf).toArray();
    }
}