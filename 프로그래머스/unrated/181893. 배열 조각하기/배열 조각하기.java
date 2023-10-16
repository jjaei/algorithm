import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }

        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                while (query[i] + 1 < list.size()) {
                    list.remove(query[i] + 1);
                }
            } else {
                for (int j = 0; j < query[i]; j++) {
                    list.remove(0);
                }
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}