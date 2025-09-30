class Solution {
    public int solution(int[] arr) {
        int repeat = 0;
        while (true) {
            boolean isChange = false;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                    isChange = true;
                } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    arr[i] = arr[i] * 2 + 1;
                    isChange = true;
                }
            }
            if(!isChange) return repeat;
            repeat++;
        }
    }
}