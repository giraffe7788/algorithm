class Solution {
    public int solution(int a, int b, int c) {
        
        int answer = 1;
        int count  = 1;
        
        if(a == b || b == c || a == c){
            count++;
        }
        
        if(a == b && b == c){
            count++;
        }
        
        for(int i = 1; i <= count; i++){
            answer *= square(a, i) + square(b, i) + square(c, i);
        }

        return answer;
    }
    
    public int square(int num, int repeat){
        if(repeat == 0) return 1;
        return num * square(num, (repeat-1));
    }
}