import java.util.HashMap;

class Solution {
    public int solution(String[] strArr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < strArr.length; i++) {
            int length = strArr[i].length();
            map.put(length, map.getOrDefault(length, 0) + 1);
        }
        int answer = 0;
        for (int max : map.values()) {
            answer = Math.max(answer, max);
        }
        return answer;
    }
}