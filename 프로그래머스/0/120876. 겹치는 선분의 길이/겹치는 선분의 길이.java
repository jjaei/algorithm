import java.util.HashMap;

class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < lines.length; i++) {
            for (int j = lines[i][0]; j < lines[i][1]; j++) {
                int count = map.getOrDefault(j, 0);
                map.put(j, count+1);
            }
        }
        for (int value : map.values()) {
            if(value > 1) {
                answer++;
            }
        }
        return answer;
    }
}