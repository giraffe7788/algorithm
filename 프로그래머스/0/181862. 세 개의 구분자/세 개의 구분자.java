import java.util.Arrays;

class Solution {
    public String[] solution(String myStr) {
        myStr = myStr.replace("a", "1").replace("b", "1").replace("c", "1");

        String[] result = Arrays.stream(myStr.split("1"))
            .filter(s -> !s.trim().isEmpty())
            .toArray(String[]::new);

        return result.length == 0 ? new String[]{"EMPTY"} : result;
    }
}