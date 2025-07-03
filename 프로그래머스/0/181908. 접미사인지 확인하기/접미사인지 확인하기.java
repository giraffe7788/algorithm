class Solution {
    public int solution(String my_string, String is_suffix) {
        if(my_string.length() < is_suffix.length()) return 0;
        return is_suffix.equals(my_string.substring(my_string.length() - is_suffix.length())) ? 1 : 0;
    }
}