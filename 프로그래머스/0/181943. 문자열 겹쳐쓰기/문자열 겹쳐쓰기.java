class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        int curr = 0;
        for(char c : my_string.toCharArray()){
            if(curr >= s && curr-s < overwrite_string.length()){
                answer += overwrite_string.charAt(curr - s);
            } else {
                answer += c;
            }
            curr++;
        }
        return answer;
    }
}