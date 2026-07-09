class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        int[] answer = new int[str.length()];

        int i = 0;
        do {
            answer[i++] = (int)(n % 10);
            n /= 10;
        } while(n > 0);

        return answer;
    }
}