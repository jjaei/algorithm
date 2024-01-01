import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            List<Integer> tmpArr = new ArrayList<>();
            for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
                tmpArr.add(array[j]);
            }
            Collections.sort(tmpArr);
            answer[i] = tmpArr.get(commands[i][2] - 1);
        }
        return answer;
    }
}