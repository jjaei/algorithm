import java.util.*;

class Solution {
    public int[] solution(int n) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 2; i <= n;) {
            while (n % i == 0) {
                set.add(i);
                n /= i;
            }
            i++;
        }

        List<Integer> answer = new ArrayList<>(set);
        Collections.sort(answer);
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}