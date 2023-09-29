public class Solution {
    public String solution(String my_string, String overwrite_string, int s) {

        StringBuilder answer = new StringBuilder(my_string);

        for (int i = s; i < overwrite_string.length() + s; i++) {
            answer.setCharAt(i, overwrite_string.charAt(i - s));
        }
        return answer.toString();
    }
}