import java.util.Arrays;

class Solution {
    public int[] solution(String s) {
        String[] str = s.split("");
        int[] answer = new int[s.length()];
        Arrays.fill(answer, -1);
        for (int i = 1; i < str.length; i++) {
            int idx = -1;
            for (int j = 0; j < i; j++) {
                if (str[j].equals(str[i])) {
                    idx = j;
                }
            }
            if (idx >= 0) {
                answer[i] = i - idx;
            }
        }
        return answer;
    }
}