import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        char[] cArr = my_string.toLowerCase().toCharArray();
        Arrays.sort(cArr);
        String answer = "";
        for (char c : cArr) {
            answer += c;
        }
        return answer;
    }
}