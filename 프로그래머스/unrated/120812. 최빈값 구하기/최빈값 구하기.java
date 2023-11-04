import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] array) {
        int answer = -1;
        int max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int num = map.getOrDefault(array[i], 0) + 1;
            map.put(array[i], num);

            if (num > max) {
                max = num;
                answer = array[i];
            } else if (num == max) {
                answer = -1;
            }
        }
        return answer;
    }
}