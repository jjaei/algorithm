import java.util.Arrays;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        for (int i = 0; i < targets.length; i++) {
            for (char c : targets[i].toCharArray()) {
                int min = Integer.MAX_VALUE;
                for (String key : keymap) {
                    int index = key.indexOf(c);
                    if (index > -1 && index < min) {
                        min = index;
                    }
                }
                if (min < Integer.MAX_VALUE && answer[i] != -1) {
                    answer[i] += min + 1;
                } else {
                    answer[i] = -1;
                }
            }
        }
        return answer;
    }
}