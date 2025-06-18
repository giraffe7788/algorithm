import java.util.stream.IntStream;

class Solution {
    public String solution(int[] numlog) {
        return IntStream.range(1, numlog.length)
                        .map(i -> {
                            return numlog[i] - numlog[i - 1] == 1   ? 'w' :
                                   numlog[i] - numlog[i - 1] == -1  ? 's' :
                                   numlog[i] - numlog[i - 1] == 10  ? 'd' : 'a';
                        })
                        .collect(StringBuilder::new,
                                    StringBuilder::appendCodePoint,
                                    StringBuilder::append)
                        .toString();
    }
}