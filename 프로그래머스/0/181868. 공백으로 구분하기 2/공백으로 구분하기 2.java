class Solution {
    public String[] solution(String my_string) {
        while(true) {
            if(my_string.contains("  ")){
                my_string = my_string.replace("  ", " ");
            } else {
                break;
            }
        }
        
        return my_string.trim().split(" ");
    }
}