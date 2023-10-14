import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < intStrs.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = s; j < s+l; j++) {
                sb.append(intStrs[i].charAt(j));
            }
            int num = Integer.valueOf(sb.toString());
            if (num > k) {
                list.add(num);
            }
        }

        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}