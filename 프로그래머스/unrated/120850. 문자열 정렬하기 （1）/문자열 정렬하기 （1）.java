import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(String my_string) {
        List<Integer> answer = new ArrayList<>();
        for (char c : my_string.toCharArray()) {
            if (c >= '0' && c <= '9') {
                answer.add(c - '0');
            }
        }
        Collections.sort(answer);
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}