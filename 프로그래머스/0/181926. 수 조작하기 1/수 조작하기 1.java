class Solution {
    public int solution(int n, String control) {
        n += control.chars().filter(c -> c == 'w').count() * 1;
        n += control.chars().filter(c -> c == 's').count() * -1;
        n += control.chars().filter(c -> c == 'd').count() * 10;
        n += control.chars().filter(c -> c == 'a').count() * -10;
        return n;
    }
}