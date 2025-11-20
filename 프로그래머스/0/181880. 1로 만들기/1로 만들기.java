class Solution {
    public int solution(int[] num_list) {
        int result = 0;
        for(int i : num_list) {
            System.out.print(i);
            while(i != 1){
                System.out.print(i);
                if (i % 2 == 0) {
                    i /= 2;
                } else {
                    i = (i - 1) / 2;
                }
                result ++;
            }
        }
        return result;
    }
}