import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();
        int[] score = {0,0,0};
        int[] man1 = {1,2,3,4,5};
        int[] man2 = {2,1,2,3,2,4,2,5};
        int[] man3 = {3,3,1,1,2,2,4,4,5,5};
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == man1[i % 5]) {
                score[0]++;
            }
            if (answers[i] == man2[i % 8]) {
                score[1]++;
            }
            if (answers[i] == man3[i % 10]) {
                score[2]++;
            }
        }
        int max = Math.max(score[0], Math.max(score[1], score[2]));
        for (int i = 0; i < score.length; i++) {
            if (max == score[i]) {
                answer.add(i + 1);
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}