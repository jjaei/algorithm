import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int start_num, int end_num) {
        List<Integer> list = new ArrayList<>();
        for (int i = start_num; i <= end_num; i++) {
            list.add(i);
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}