import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String[] sArr = s.split("");
        Arrays.sort(sArr);
        String answer = "";
        for (int i = sArr.length - 1; i >= 0; i--) {
            answer += sArr[i];
        }
        return answer;
    }
}
