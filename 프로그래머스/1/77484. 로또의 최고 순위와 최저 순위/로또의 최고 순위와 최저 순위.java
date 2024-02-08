class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count = 0;
        for (int i = 0; i < lottos.length; i++) {
            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    count++;
                    break;
                }
            }
        }
        
        int check = 0;
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                check++;
            }
        }
        int max = count + check;
        int min = count;
        int[] rank = {6, 5, 4, 3, 2, 1};
        for (int i = 0; i < rank.length; i++) {
            if (rank[i] == max) {
                answer[0] = i + 1;
            }
            if (rank[i] == min) {
                answer[1] = i + 1;
            }
        }
        if (answer[0] == 0) {
            answer[0] = 6;
        }
        if (answer[1] == 0) {
            answer[1] = 6;
        }
        return answer;
    }
}