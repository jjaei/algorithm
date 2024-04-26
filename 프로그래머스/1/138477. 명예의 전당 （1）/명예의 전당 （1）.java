import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        PriorityQueue<Integer> que = new PriorityQueue<>();
        int[] answer = new int[score.length];
        for (int i = 0; i < score.length; i++) {
            que.add(score[i]);
            if (que.size() > k) {
                que.remove();
            }
            answer[i] = que.peek();
        }
        return answer;
    }
}