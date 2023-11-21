class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        for (int i = 0; i < answer.length; i++) {
            int rank = 1;
            for (int j = 0; j < answer.length; j++) {
                if (emergency[i] < emergency[j]) {
                    rank++;
                }
            }
            answer[i] = rank;
        }
        return answer;
    }
}