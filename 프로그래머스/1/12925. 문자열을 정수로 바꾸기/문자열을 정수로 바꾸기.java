class Solution {
    public int solution(String s) {

        boolean sign = true;
        int answer = 0;

        for(int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '-') {
                sign = false;
            } else if (s.charAt(i) != '+') {
                answer = answer * 10 + (s.charAt(i) - '0');
            }
        }

        return sign ? answer : answer * -1;
    }
}