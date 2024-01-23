import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 1; j < numbers.length; j++) {
                if (i != j) {
                    set.add(numbers[i] + numbers[j]);
                }
            }
        }
        List<Integer> answer = new ArrayList<>(set);
        Collections.sort(answer);
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}