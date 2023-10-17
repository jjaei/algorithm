import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        for (int i = 0; i < answer.length - n; i++) {
            answer[i] = num_list[i + n];
        }
        for (int j = 0; j < n; j++) {
            answer[num_list.length + j - n] = num_list[j];
        }
        return answer;
    }
}