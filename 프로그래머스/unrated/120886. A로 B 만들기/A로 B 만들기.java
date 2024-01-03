import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        char[] c1 = before.toCharArray();
        char[] c2 = after.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if (new String(c1).equals(new String(c2))) {
            return 1;
        } else {
            return 0;
        }
    }
}