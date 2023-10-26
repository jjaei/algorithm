import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int index = arr[i];
            for (int j = 0; j < index; j++) {
                answer.add(index);
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}