import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int start = slicer[0];
        int end = slicer[1];
        int jump = slicer[2];
        List<Integer> list = new ArrayList<>();

        if (n == 1) {
            for (int i = 0; i <= end; i++) {
                list.add(num_list[i]);
            }
        } else if (n == 2) {
            for (int i = start; i < num_list.length; i++) {
                list.add(num_list[i]);
            }
        } else if (n == 3) {
            for (int i = start; i <= end; i++) {
                list.add(num_list[i]);
            }
        } else {
            for (int i = start; i <= end; i += jump) {
                list.add(num_list[i]);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}