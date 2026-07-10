class Solution {
    public long solution(long n) {
        double squareRoot = Math.sqrt(n);
        if(squareRoot % 1 == 0){
            return (long) Math.pow(squareRoot + 1, 2);
        }
        return -1;
    }
}