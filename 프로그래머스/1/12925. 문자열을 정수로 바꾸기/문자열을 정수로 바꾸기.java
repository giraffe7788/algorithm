class Solution {
    public int solution(String s) {

        if(s.startsWith("+")) {
            return Integer.parseInt(s.substring(1, s.length()));
        } else if(s.startsWith("-")) {
            return Integer.parseInt(s.substring(1, s.length())) * -1;
        } else {
            return Integer.parseInt(s);
        }
    }
}