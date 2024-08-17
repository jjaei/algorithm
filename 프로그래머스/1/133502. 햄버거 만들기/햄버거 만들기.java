import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for (int i : ingredient) {
            list.add(i);
            if (list.size() >= 4 && list.get(list.size() - 1) == 1 && list.get(list.size() - 2) == 3
             && list.get(list.size() - 3) == 2 && list.get(list.size() - 4) == 1) {
                answer++;
                for (int k = 0; k < 4; k++) {
                    list.remove(list.size()-1);
                }
            }
        }
        return answer;
    }
}