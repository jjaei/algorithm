import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int money = 0;
        Arrays.sort(d);
        for (int i = 0; i < d.length; i++) {
            money += d[i];
            if (budget >= money) {
                answer++;
            }
        }
        return answer;
    }
}