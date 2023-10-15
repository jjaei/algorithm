import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        List<Integer> index = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                index.add(i);
            }
        }
        if (index.isEmpty()) {
            list.add(-1);
        } else {
            for (int i = index.get(0); i <= index.get(index.size() - 1); i++) {
                list.add(arr[i]);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}