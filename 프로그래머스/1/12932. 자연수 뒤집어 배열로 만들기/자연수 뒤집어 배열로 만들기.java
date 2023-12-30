import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(long n) {
        List<Integer> answer = new ArrayList<>();
        while (n > 0) {
            long tmp = 0;
            tmp = n % 10;
            answer.add((int)tmp);
            n /= 10;
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}