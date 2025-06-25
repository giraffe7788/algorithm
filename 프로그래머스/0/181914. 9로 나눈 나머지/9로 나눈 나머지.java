class Solution {
    public int solution(String number) {
        return number.chars().map(c -> c - 48).sum() % 9;
    }
}