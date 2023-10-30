import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        List<Integer> answer = new ArrayList<>();
        for(int i=5; i<num_list.length; i++){
            answer.add(num_list[i]);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}