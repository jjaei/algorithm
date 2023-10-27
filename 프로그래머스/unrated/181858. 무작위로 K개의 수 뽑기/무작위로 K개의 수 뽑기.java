import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int k) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int a : arr) {
            set.add(a);
        }
        List<Integer> list = new ArrayList<>(set);

        while (list.size() < k) {
            list.add(-1);
        }
        int[] answer = new int[k];
        for (int i = 0; i < k; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}