class Solution {
    public String solution(String my_string, int[][] queries) {

        StringBuilder new_string = new StringBuilder(my_string);

        for(int[] arr : queries){
            String reverse = new StringBuilder(new_string.substring(arr[0], arr[1] + 1)).reverse().toString();
            new_string.replace(arr[0], arr[1] + 1, reverse);
        }

        return new_string.toString();
    }
}