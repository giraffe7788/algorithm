import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {

        Map<Integer, Integer> map = new HashMap<>();
        for(int i : new int[]{a, b, c, d}) {
            map.merge(i, 1, Integer::sum);
        }

        map.entrySet()
                .stream()
                .filter(entry ->
                        entry.getValue() != 2
                )
                .mapToInt(entry -> entry.getKey()).forEach(System.out::println);

        switch(map.size()){
            case 1:
                return map.keySet().iterator().next() * 1111;
            case 2:
                if(map.values().iterator().next() == 2){
                    Iterator<Integer> iterator = map.keySet().iterator();
                    int p = iterator.next();
                    int q = iterator.next();
                    return (p + q) * Math.abs(p - q);
                } else {
                    return (int)Math.pow(map.entrySet()
                                    .stream()
                                    .mapToInt(entry -> {
                                        return entry.getValue() == 3 ? entry.getKey() * 10 : entry.getKey();
                                    })
                                    .sum(), 2);
                }
            case 3:
                return map.entrySet()
                          .stream()
                          .filter(entry ->
                              entry.getValue() != 2
                          )
                          .mapToInt(entry -> entry.getKey())
                          .reduce(1, (p, q) -> p*q);
            default:
                return map.keySet().stream().min(Integer::compare).get();
        }
    }
}