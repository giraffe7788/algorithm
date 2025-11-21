class Solution {
    public int solution(String binomial) {
        String[] strs = binomial.split("[^0-9]+");
        if(binomial.contains("+")) return Integer.parseInt(strs[0]) + Integer.parseInt(strs[1]);
        if(binomial.contains("-")) return Integer.parseInt(strs[0]) - Integer.parseInt(strs[1]);
        return Integer.parseInt(strs[0]) * Integer.parseInt(strs[1]);
    }
}