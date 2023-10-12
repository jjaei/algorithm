import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        int num = n;
        for (int i = 1; i < n; i++) {

            if (num == 1) {
                list.add(num);
                break;
            }

            if (num % 2 == 0) {
                list.add(num);
                num = num / 2;
            } else if (num % 2 != 0) {
                list.add(num);
                num = (3 * num) + 1;
            }
        }
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}