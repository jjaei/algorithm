import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            int num = i;
            boolean isValid = true;

            while (num > 0) {
                int digit = num % 10;
                if (digit != 0 && digit != 5) {
                    isValid = false;
                    break;
                }
                num /= 10;
            }
            if (isValid) {
                list.add(i);
            }
        }
        if (list.isEmpty()) {
            return new int[]{-1};
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}