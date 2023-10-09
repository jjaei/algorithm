import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = arr[i];
        }

        for (int i = 0; i < queries.length; i++) {
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (j % queries[i][2] == 0) {
                    answer[j] += 1;
                }
            }
        }
        return answer;
    }
}