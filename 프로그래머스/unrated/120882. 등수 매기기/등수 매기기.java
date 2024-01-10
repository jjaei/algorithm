class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[] avgArr = new double[score.length];
        for (int i = 0; i < score.length; i++) {
            avgArr[i] = (score[i][0] + score[i][1]) / 2.0;
        }
        for (int j = 0; j < avgArr.length; j++) {
            int rank = 1;
            for (int k = 0; k < avgArr.length; k++) {
                if (avgArr[j] < avgArr[k]) {
                    rank++;
                }
            }
            answer[j] = rank;
        }
        return answer;
    }
}